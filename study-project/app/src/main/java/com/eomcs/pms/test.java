package com.eomcs.pms;
import java.util.Scanner;

public class test {
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();

    if(1<=a && b<=10000) {
      System.out.printf("%d \n", a+b);
      System.out.printf("%d \n", a-b);
      System.out.printf("%d \n", a*b);
      System.out.printf("%d \n", a/b);
      System.out.printf("%d \n", a%b);
    }
  }
}
