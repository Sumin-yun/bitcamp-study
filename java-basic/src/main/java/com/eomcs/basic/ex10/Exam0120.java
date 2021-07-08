package com.eomcs.basic.ex10;

public class Exam0120 {
  public static void main(String args[]) {
    java.util.Date d = new java.util.Date();
    System.out.println(d.toString());
    System.out.printf("%tY-%tm-%td",d,d,d);
    System.out.printf("%tY-%1$tm-%1$td",d);



  }

}
