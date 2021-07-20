package com.eomcs.oop.ex00;

//1.메서드 분리
//2.result 클래스변수로 분리.
//3.Calculateor를 인스턴스 필드로 변경.
//4.인스턴스 메소드로 변경 (유효한 주소를 앞에서 받는다.)
//5.Calcuㅣateor를 다른 파일로 분리.
//6.Calcuㅣateor를 다른 패키지로 분리.

public class Exam0500{


  static  class Calculator {

    int result = 0;

    void plus(int value) {
      this.result += value;
    }

    void minus(int value) {
      this.result -= value;
    }

    void multiple(int value) {
      this.result *= value;
    }

    void divide(int value) {
      this.result /= value;
    }

    static int abs(int a) {
      return a >= 0 ? a : a*-1;
    }
  }


  public static void main(String[] args) {

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();


    c1.plus(2); // + 2
    c2.plus(3); // + 3

    c1.plus(3); // + 2 + 3
    c2.multiple(2); // + 3 * 2

    c1.minus(1); // + 2 + 3 - 1
    c2.plus(7); // + 3 * 2 + 7

    c1.multiple(7); // + 2 + 3 - 1 * 7
    c2.divide(4); // + 3 * 2 + 7 / 4

    c1.divide(3); // + 2 + 3 - 1 * 7 / 3 = ?
    c2.minus(5); // + 3 * 2 + 7 / 4 - 5 = ?

    System.out.printf("result = %d\n", c1.result);
    System.out.printf("result = %d\n", c2.result);
  }
}








