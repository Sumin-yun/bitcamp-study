// top level class : 접근 범위
package com.eomcs.oop.ex11.a;

// top level class
// - 패키지에 소속된 클래스다.
//
public class Exam0110 {
  public static void main(String[] args) {
    // public 으로 공개된 클래스는 다른 패키지에서 접근 할 수 있다.
    com.eomcs.oop.ex11.a.sub.A obj1 = new com.eomcs.oop.ex11.a.sub.A();

    //public으로 공개되지 않은 클래스는 같은 패키지에서만 접근할 수있다.
    // com.eomcs.oop.ex11.a.sub.B obj2 = new com.eomcs.oop.ex11.a.sub.B();

    //com.eomcs.oop.ex11.a.sub.B obj2 = new com.eomcs.oop.ex11.a.sub.B(); // 컴파일 오류!

    // A obj3= new A();
    //  B obj4= new B();

  }
}
