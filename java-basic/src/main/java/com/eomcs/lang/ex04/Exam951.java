package com.eomcs.lang.ex04;

//# 형변환 - 명시적 형변환이 불가능한 경우 
// 
public class Exam951 {
  public static void main(String[] args) {

    boolean v1 = boolean.valueOf( "true"); 
    char v2 = "가".charAt(0);

    int v3 = Integer.valueOf("123");
    int v33 = Integer.parseInt("123");

    float v4 = Float.valueOf "3.14f";
    float v44 = Float.parseFloat "3.14f";
  }
}
