package com.eomcs.pms.handler;

import java.util.List;
import com.eomcs.pms.domain.Member;

public class MemberUpdateHandler extends AbstractMemberHandler {

  List<Member> memberList;

  public MemberUpdateHandler(List<Member> memberList) {
    super(memberList);
  }


  public void list() {
    System.out.println("[회원 목록]");

    Member[] list = memberList.toArray(new Member[0]);

    for (Member member : list) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          member.getNo(), 
          member.getName(), 
          member.getEmail(), 
          member.getTel(), 
          member.getRegisteredDate());
    }
  }
}






