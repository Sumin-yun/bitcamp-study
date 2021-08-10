package com.eomcs.oop.ex07.f;

//추상 메서드만 있을 경우,
//객체 사용규칙을 정의하는 "인터페이스" 문법으로 바꿔도 좋다.

public abstract class Sorter {

  // 인터페이스 호출 규칙을 정의하는 것이기 때문에
  // 모든 메서드는 기본이 public이고, abstract이다.
  //
  public abstract void sort(int[] values);
}
