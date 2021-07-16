package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;
import com.eomcs.pms.util.Prompt;

public class MemberHandle {

  static final int LENGTH = 10;
  static Member[] members = new Member[LENGTH];
  static int size = 0;

  public static void add() {

    Member member = new Member();

    System.out.println("[회원 등록]");

    member.no = Prompt.inputInt("번호? ");
    member.name = Prompt.inputString("이름? ");
    member.email = Prompt.inputString("이메일? ");
    member.password = Prompt.inputString("암호? ");
    member.photo = Prompt.inputString("사진? ");
    member.tel = Prompt.inputString("전화? ");
    member.registeredDate = new java.sql.Date(System.currentTimeMillis());

    members[size++] = member;
  }

  public static void list() {
    System.out.println("[회원 목록]");

    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          members[i].no, 
          members[i].name, 
          members[i].email, 
          members[i].photo, 
          members[i].registeredDate);
    }
  }

}
