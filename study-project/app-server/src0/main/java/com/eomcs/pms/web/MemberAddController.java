package com.eomcs.pms.web;

import java.util.Collection;
import java.util.UUID;
import javax.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.eomcs.pms.domain.Member;
import net.coobird.thumbnailator.ThumbnailParameter;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import net.coobird.thumbnailator.name.Rename;

//@MultipartConfig(maxFileSize = 1024 * 1024 * 10)


@Controller
public class MemberAddController add(Member member, Part photoFile) throws Exception {

  @Autowired SqlSession sqlSession;
  @Autowired MemberDao memberDao;
  @Autowired ServletContext sc;

  @GetMapping("/member/add")
  public ModelAndView add() throws Exception {
    try {

      if(photo) {}
      Member member = new Member();

      member.setName(request.getParameter("name"));
      member.setEmail(request.getParameter("email"));
      member.setPassword(request.getParameter("password"));
      member.setTel(request.getParameter("tel"));

      Part photoPart = request.getPart("photo");
      if (photoPart.getSize() > 0) {
        String filename = UUID.randomUUID().toString();
        photoPart.write(getServletContext().getRealPath("/upload/member") + "/" + filename);
        member.setPhoto(filename);

        Thumbnails.of(getServletContext().getRealPath("/upload/member") + "/" + filename)
        .size(20, 20)
        .outputFormat("jpg")
        .crop(Positions.CENTER)
        .toFiles(new Rename() {
          @Override
          public String apply(String name, ThumbnailParameter param) {
            return name + "_20x20";
          }
        });

        Thumbnails.of(getServletContext().getRealPath("/upload/member") + "/" + filename)
        .size(100, 100)
        .outputFormat("jpg")
        .crop(Positions.CENTER)
        .toFiles(new Rename() {
          @Override
          public String apply(String name, ThumbnailParameter param) {
            return name + "_100x100";
          }
        });
      }

      memberDao.insert(member);
      sqlSessionFactory.openSession().commit();

      ModelAndView mv = new ModelAndView();
      mv.addObject("member", member);
      mv.addObject("refresh", "2;url=list");
      mv.addObject("pageTitle", "회원등록");
      mv.addObject("contentUrl","member/MemberAdd.jsp");
      mv.setViewName("template1");
      return mv;

    }


    @GetMapping("/member/list")
    public ModelAndView list() throws Exception {

      // 클라이언트 요청을 처리하는데 필요한 데이터 준비
      Collection<Member> memberList = memberDao.findAll();

      ModelAndView mv = new ModelAndView();
      mv.addObject("memberList", memberList);
      mv.addObject("pageTitle", "회원목록");
      mv.addObject("contentUrl","member/MemberList.jsp");
      mv.setViewName("template1");
      return mv;
    }


    @GetMapping("/member/detail")
    public ModelAndView detail(int no) throws Exception{

      Member member = memberDao.findByNo(no);

      if (member == null) {
        throw new Exception("해당 번호의 회원이 없습니다.");
      }

      ModelAndView mv = new ModelAndView();
      mv.addObject("member", member);
      mv.addObject("pageTitle", "회원정보");
      mv.addObject("contentUrl","member/MemberDetail.jsp");
      mv.setViewName("template1");
      return mv;
    }
  }







