// anonymous class : 로컬 클래스 vs 익명 클래스
package com.eomcs.oop.ex11.e;

public class Exam0121 {

  // 클래스는 static과 non-static이 구분된다.
  static abstract class A {
    abstract void print();
  }

  public static void main(final String[] args) {


    A obj2 = new A() {
      @Override
      void print() {
        public void print() {
          System.out.println("Hello2!");

        }
      }
    }