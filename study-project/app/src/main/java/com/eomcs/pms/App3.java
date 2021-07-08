package com.eomcs.pms;

<<<<<<< HEAD
import java.sql.Date;
import java.util.Scanner;
=======
<<<<<<< HEAD
public class App3 {
  public static void main(String args[]) {
    System.out.println("");
=======
//pms 02-a-실습3
>>>>>>> 2b44aabe09e3e0086ec95ed4dd8fe7872ec30ad0

public class App3 {

  public static void main(String[] args) {
    System.out.println("[작업]");

<<<<<<< HEAD
    Scanner keyboardScan = new Scanner(System.in);

    System.out.print("프로젝트? ");
    String project = keyboardScan.nextLine();

    System.out.print("번호? ");
    int no = Integer.parseInt(keyboardScan.nextLine());

    System.out.print("내용? ");
    String content = keyboardScan.nextLine();

    System.out.print("마감일? ");
    Date deadline = Date.valueOf(keyboardScan.nextLine());

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    int status = Integer.valueOf(keyboardScan.nextLine());
=======
>>>>>>> 8bda8ca9f1ec167de5234a4c004220f0b2119625
  }
>>>>>>> 2b44aabe09e3e0086ec95ed4dd8fe7872ec30ad0

    System.out.print("담당자? ");
    String owner = keyboardScan.nextLine();

    keyboardScan.close();

    System.out.println("--------------------------------");

    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", content);
    System.out.printf("마감일: %s\n", deadline);

    switch (status) {
      case 1:
        System.out.println("상태: 진행중");
        break;
      case 2:
        System.out.println("상태: 완료");
        break;
      default:
        System.out.println("상태: 신규");
    }

    System.out.printf("담당자: %s\n", owner);
  }
}
