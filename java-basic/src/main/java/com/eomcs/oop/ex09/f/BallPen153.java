package com.eomcs.oop.ex09.f;

public class BallPen153 extends Monami implements Pen {
  //BallPen153은 Monami 에서 기본 기능(press) 을 받고 
  //pen 규칙(use)에 따라 동작하도록 만든다.
  @Override
  public void write(String text) {
    if (!this.use)
      return;
    System.out.println("모나미 ** " + text + " **");
  }
}
