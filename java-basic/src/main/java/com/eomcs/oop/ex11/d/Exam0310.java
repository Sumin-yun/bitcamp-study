// local class에서 바깥클래스 접
package com.eomcs.oop.ex11.d;

class D {

  void m1() {
    int a = 100;
    int b = 200;

    class X {

      // 1) 로컬 클래스는 바깥 메서드의 로콜 변수 a,b 값을 저장할 필드를 자동으로 추가한다.
      // 사용하는 값을 저장할 필드(a)를 자동으로 추가한다.
      // 2) 또한 로컬 클래스의 객체를 생성할 때 그 값을 사용할 수 있도록 
      // 생성자에서 로컬 변수의 값을 받는 파라미터를 추가한다.
      //    public X(D outer, int a){
      //        this.a = a;
      //        this.outer = outer;
      // .class 파일의 코드:
      //      class com.eomcs.oop.ex11.d.D$1X {
      //
      //        int v3; <== 로컬 클래스의 인스턴스 필드
      //        final synthetic com.eomcs.oop.ex11.d.D this$0;  <== 바깥 클래스의 인스턴스 주소 저장
      //        private final synthetic int val$v2; <== 바깥 메서드의 로컬 변수 저장
      //
      void f1() {
        //그래서 로컬 클래스에서는 바깥 메서드의 로컬 변수를 
        //마치 자기것인양 사용할 수 있는 것이다.
        System.out.println(a);  
      }
    }

    X obj = new X();
    obj.f1();
  }

  static void m2() {
    int a = 100;
    int b = 200;

    //스태틱 메서드의 로컬 클래스도 인스턴스 메서드의 로컬 클래스와 같다.

    class X {
      void f1() {
        System.out.println(a);  
      }
    }

    X obj = new X();
    obj.f1();
  }

  public class Exam0310{

    public static void main(String[] args) {
      D obj = new D();
      obj.m1();
    }

  }
}