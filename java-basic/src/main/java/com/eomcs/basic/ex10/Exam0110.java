package com.eomcs.basic.ex10;

public class Exam0110 {
  public static void main(String args[]) {
    long millis = System.currentTimeMillis();
    System.out.println(millis);

    java.util.Date d = new java.sql.Date(millis);
    System.out.println(d.toString());

    java.util.Date c = new java.util.Date(millis);
    System.out.println(c.toString());


    //sql = 2021-07-08의 형태로 바꾸어주는 명령.
    //d= Date 설계도 (millis: 설계 조건) 이용하여 만들 물건. 객체(Object)
    //toString = d 라는 리모컨을 이용하여 수행할 동작

  }

}
