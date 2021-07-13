package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// 1) 변경 준비
// 2) 사용자에게 명령 프롬프트 출력
// 3) 사용자의 명령을 입력 받아 출력
// 4) 명령을 입력 받아 출력하는 것을 무한 반복
// 5) exit나 quit 명령을 입력하면 반복 실행 중지
// 6) /member/add와 /member/list 명령을 구분해 보자!
// 7) /member/add 명령 처리
// 8) /member/list 명령 처리
// 9) /project/add 명령 처리
// 10) /project/list 명령 처리
// 11) /task/add 명령 처리
// 12) /task/list 명령 처리
// 14) 메서드 분리
// 15) 명령어 입력 prompt 메서드 분리
// 16) prompt에 문자열 입력 기능 추가
// 17) prompt기능 세부

public class App {
  // 회원 정보
  static Scanner keyboardScan = new Scanner(System.in);

  static final int LENGTH = 100;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] registeredDate = new Date[LENGTH];
  static int size = 0;

  // 프로젝트 정보
  static final int PROJECT_LENGTH = 1000;
  static int[] pNo = new int[PROJECT_LENGTH];
  static String[] pTitle = new String[PROJECT_LENGTH];
  static String[] pContent = new String[PROJECT_LENGTH];
  static Date[] pStartDate = new Date[PROJECT_LENGTH];
  static Date[] pEndDate = new Date[PROJECT_LENGTH];
  static String[] pOwner = new String[PROJECT_LENGTH];
  static String[] pMembers = new String[PROJECT_LENGTH];
  static int pSize = 0;

  // 작업 정보
  static final int TASK_LENGTH = 100;
  static int[] tNo = new int[TASK_LENGTH];
  static String[] tContent = new String[TASK_LENGTH];
  static Date[] tDeadline = new Date[TASK_LENGTH];
  static String[] tOwner = new String[TASK_LENGTH];
  static int[] tStatus = new int[TASK_LENGTH];
  static int tSize = 0;


  public static void main(String[] args) {

    while (true) {

      String input = prompt("명령>>");

      if (input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;
      } else if (input.equals("/member/add")) {
        addMember();

      } else if (input.equals("/member/list")) {
        listMember();

      } else if (input.equals("/project/add")) {
        addProject();

      } else if (input.equals("/project/list")) {
        listProject();

      } else if (input.equals("/task/add")) {
        addTasks();

      } else if (input.equals("/task/list")) {
        listTasks();
      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }

    keyboardScan.close();
  }

  static void addMember() {

    System.out.println("[회원 등록]");

    no[size] = Integer.parseInt(prompt("번호?"));
    name[size] = prompt("이름?"); 
    email[size] = prompt("이메일? ");
    password[size] = prompt("암호? "); 
    photo[size] =   prompt("사진? ");    
    tel[size] = prompt("전화? ");

    registeredDate[size] = new Date(System.currentTimeMillis());

    size++;

  }

  static void listMember() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  }

  static void addProject() {
    System.out.println("[프로젝트 등록]");


    pNo[pSize] = Integer.valueOf(prompt("번호?"));  
    pTitle[pSize] = prompt("프로젝트명? ");    
    pContent[pSize] =  prompt("내용? ");   
    pStartDate[pSize] = Date.valueOf(prompt("시작일? ")); 
    pEndDate[pSize] = Date.valueOf(prompt("종료일? "));
    pOwner[pSize] = prompt("만든이? "); 
    pMembers[pSize] = prompt("팀원? ");

    pSize++;

  }

  static void listProject() {
    for (int i = 0; i < pSize; i++) {
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          tNo[i], tContent[i], pStartDate[i] , tDeadline[i], tOwner[i]);
    }
  }

  static void addTasks() {
    System.out.println("[작업 등록]");


    tNo[tSize] = Integer.parseInt(prompt("번호? "));


    tContent[tSize] =  prompt("내용? ");


    tDeadline[tSize] = Date.valueOf(prompt("마감일? "));

    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    tStatus[tSize] = Integer.valueOf(prompt("상태?"));
    tOwner[tSize] = prompt("담당자? ");

    tSize++;
  }

  static void listTasks() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < tSize; i++) {
      String stateLabel = null;
      switch (tStatus[i]) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
          // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
          System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
              tNo[i], tContent[i], stateLabel, tDeadline[i],  tOwner[i]);
      }
    }
  }

  //prompt: 사용자로부터 문자열을 입력받는 기능 수행
  //파라미터:title
  //리턴값:String 

  static String prompt(String title) {  //프롬프트를 실행하기 위해 문자열을 선언
    System.out.print("title"); 
    String input = keyboardScan.nextLine();
    return input;
  }}


