// local class에서 바깥클래스 접
package com.eomcs.oop.ex11.d;

class D22 {
  int v1 = 1;

  void m1() {
    // 인스턴스 메서드는 this에 C 인스턴스 주소를 저장하고 있다.
    int v1 = 10;

    class X {
      int v1 = 1000 ;

      // 로컬 클래스는 바깥 클래스의 인스턴스 주소를 저장할 필드가 있을 뿐만 아니라
      // 인스턴스 메서드 안에 선언된 로컬 변수의 값을 저장할 필드도 있다.
      // .class 파일의 코드:
      //      class com.eomcs.oop.ex11.d.D$1X {
      //
      //        int v3; <== 로컬 클래스의 인스턴스 필드
      //        final synthetic com.eomcs.oop.ex11.d.D this$0;  <== 바깥 클래스의 인스턴스 주소 저장
      //        private final synthetic int val$v2; <== 바깥 메서드의 로컬 변수 저장
      //

      void f() {
        //int v4 = 4;
        // System.out.printf("v4 = %d\n", v4);
        // System.out.printf("v3 = %d\n", this.v3);
        // System.out.printf("v2 = %d\n", v2);
        System.out.printf("v1 = %d\n", v1);


      }
    }

    X obj = new X();
    obj.f();
  }
}

public class Exam0321 {

  public static void main(String[] args) {
    D obj = B D22();
    obj.m1();
  }

}
