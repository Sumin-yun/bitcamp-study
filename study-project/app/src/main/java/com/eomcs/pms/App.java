package com.eomcs.pms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import com.eomcs.menu.Menu;
import com.eomcs.menu.MenuGroup;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.handler.AuthHandler;
import com.eomcs.pms.handler.BoardAddHandler;
import com.eomcs.pms.handler.BoardDeleteHandler;
import com.eomcs.pms.handler.BoardDetailHandler;
import com.eomcs.pms.handler.BoardListHandler;
import com.eomcs.pms.handler.BoardUpdateHandler;
import com.eomcs.pms.handler.MemberAddHandler;
import com.eomcs.pms.handler.MemberDeleteHandler;
import com.eomcs.pms.handler.MemberDetailHandler;
import com.eomcs.pms.handler.MemberListHandler;
import com.eomcs.pms.handler.MemberUpdateHandler;
import com.eomcs.pms.handler.ProjectAddHandler;
import com.eomcs.pms.handler.ProjectDeleteHandler;
import com.eomcs.pms.handler.ProjectListHandler;
import com.eomcs.pms.handler.ProjectUpdateHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

public class App {
  List<Board> boardList = new ArrayList<>();
  List<Member> memberList = new LinkedList<>();
  List<Project> projectList = new ArrayList<>();

  BoardAddHandler boardAddHandler = new BoardAddHandler(boardList);
  BoardListHandler boardListHandler = new BoardListHandler(boardList);
  BoardDetailHandler boardDetailHandler = new BoardDetailHandler(boardList);
  BoardUpdateHandler boardUpdateHandler = new BoardUpdateHandler(boardList);
  BoardDeleteHandler boardDeleteHandler = new BoardDeleteHandler(boardList);

  MemberAddHandler memberAddHandler = new MemberAddHandler(memberList);
  MemberListHandler memberListHandler = new MemberListHandler(memberList);
  MemberDetailHandler memberDetailHandler = new MemberDetailHandler(memberList);
  MemberUpdateHandler memberUpdaeteHandler = new MemberUpdateHandler(memberList);
  MemberDeleteHandler memberDeleteHandler = new MemberDeleteHandler(memberList);

  ProjectAddHandler projectAddHandler = new ProjectAddHandler(projectList, memberHandler);
  ProjectListHandler projectListHandler = new ProjectListHandler(projectList, memberHandler);
  ProjectUodateHandler projectUpdateHandler = new ProjectUpdateHandler(projectList, memberHandler);
  ProjectDetailHandler projectDetailHandler = new ProjectDetailHandler(projectList, memberHandler);
  ProjectDeleteHandler projectDeleteHandler = new ProjectDeleteHandler(projectList, memberHandler);

  TaskHandler taskHandler = new TaskHandler(projectHandler);
  AuthHandler authHandler = new AuthHandler(memberList);

  public static void main(String[] args) {
    App app = new App(); 
    app.service();
  }

  void service() {
    createMenu().execute();
    Prompt.close();
  }

  Menu createMenu() {
    MenuGroup mainMenuGroup = new MenuGroup("메인");
    mainMenuGroup.setPrevMenuTitle("종료");

    mainMenuGroup.add(new Menu("로그인", Menu.ENABLE_LOGOUT) {
      @Override
      public void execute() {
        authHandler.login(); 
      }
    });

    mainMenuGroup.add(new Menu("내정보", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        authHandler.displayLoginUser(); 
      }
    });

    mainMenuGroup.add(new Menu("로그아웃", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        authHandler.logout(); 
      }
    });

    MenuGroup boardMenu = new MenuGroup("게시판");
    mainMenuGroup.add(boardMenu);

    boardMenu.add(new Menu("등록", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        boardAddHandler.add(); 
      }});
    boardMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        boardListHandler.list(); 
      }});
    boardMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        boardDetailHandler.detail(); 
      }});
    boardMenu.add(new Menu("변경", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        boardUpdateHandler.update(); 
      }});
    boardMenu.add(new Menu("삭제", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        boardDeleteHandler.delete(); 
      }});

    MenuGroup memberMenu = new MenuGroup("회원");
    mainMenuGroup.add(memberMenu);

    memberMenu.add(new Menu("등록", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        memberHandler.add(); 
      }});
    memberMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        memberHandler.list(); 
      }});
    memberMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        memberHandler.detail(); 
      }});
    memberMenu.add(new Menu("변경", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        memberHandler.update(); 
      }});
    memberMenu.add(new Menu("삭제", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        memberHandler.delete(); 
      }});

    MenuGroup projectMenu = new MenuGroup("프로젝트");
    mainMenuGroup.add(projectMenu);

    projectMenu.add(new Menu("등록", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        projectHandler.add(); 
      }});
    projectMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        projectHandler.list(); 
      }});
    projectMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        projectHandler.detail(); 
      }});
    projectMenu.add(new Menu("변경", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        projectHandler.update(); 
      }});
    projectMenu.add(new Menu("삭제", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        projectHandler.delete(); 
      }});

    MenuGroup taskMenu = new MenuGroup("작업");
    mainMenuGroup.add(taskMenu);

    taskMenu.add(new Menu("등록", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        taskHandler.add(); 
      }});
    taskMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        taskHandler.list(); 
      }});
    taskMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        taskHandler.detail(); 
      }});
    taskMenu.add(new Menu("변경", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        taskHandler.update(); 
      }});
    taskMenu.add(new Menu("삭제", Menu.ENABLE_LOGIN) {
      @Override
      public void execute() {
        taskHandler.delete(); 
      }});


    return mainMenuGroup;
  }
}












