package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

//원본 emocs-java-project-2021
//mini-pms-02-b


public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");

    final int MAX_LENGTH=100;   // final: 더 이상 값을 초기화 할 수 없다.
    // 대문자 선언 : 조회용으로만 사용하는 상수임을 보여줌

    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] registeredDate = new Date[MAX_LENGTH];

    Scanner keyboardScan = new Scanner(System.in);
    int size = 0;

    for (int i=0; i<MAX_LENGTH; i=i+1) {

      size= size+1;         //입력된 값을 저장해둠.     

      System.out.print("번호? ");
      no[i]= Integer.parseInt(keyboardScan.nextLine());    
      System.out.print("이름? ");
      name[i]= keyboardScan.nextLine(); 
      System.out.print("이메일? ");
      email[i]= keyboardScan.nextLine();   
      System.out.print("암호? ");
      password[i]= keyboardScan.nextLine();   
      System.out.print("사진? ");
      photo[i] = keyboardScan.nextLine();
      System.out.print("전화? ");
      tel[i] = keyboardScan.nextLine();
      registeredDate[i] = new Date();
      System.out.println();

      System.out.println("계속 입력하시겠습니까?? y/N "); //N만 대문자로 쓴것은, N을 디폴트로 사용한다는 뜻
      String input=keyboardScan.nextLine();
      if (input.equalsIgnoreCase("N") || input.equals("")) {      //문자열 비교: 문자열변수.equals(비교할문자)
        break;                                      // +IgnoreCase = 대소문자를 구분한다.
      }

      System.out.println();

    }

    // 현재 일시 알아내기
    //java.sql.Date now = new java.sql.Date(System.currentTimeMillis());
    // System.currentTimeMillis()
    //   - 1970년 1월 1일 0시 0분 0초부터 현재까지 경과된 시간을 밀리초로 리턴한다.
    // new java.sql.Date(밀리초)
    //  - 넘겨 받은 밀리초를 가지고 년,월,일,시,분,초를 계산한다.

    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

    System.out.println("--------------------------------");

    for (int i=0; i<size; i++) {
      System.out.printf("%d, %s, %s, %s, %5$tY-%5$tm-%5$td \n"
          , no[i],name[i],email[i],tel[i],registeredDate[i]);  //YYYY-MM-DD 형태로 출력
      System.out.printf("암호: %s\n", password[i]);
      System.out.printf("사진: %s\n", photo[i]);


      System.out.println();

    }
  }
}
