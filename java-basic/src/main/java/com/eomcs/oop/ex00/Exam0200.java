package com.eomcs.oop.ex00;


public class Exam0200 {
  public static void main(String[] args) {
    //인스턴스 변수 테스트

    //인스턴스변수 - new 명령을 실행하여 heap영역에 생성.
    //가비지가 된 후 가비지 컬렉터에 의해 제거.

    Test t1= new Test();

    test1(t1);

    System.out.println(t1.b);

    Test t2 = new Test();

    test1(t2);

    System.out.println(t2.b);
  }
  static void test1(Test p) {
    p.b = 3000;
  }

}