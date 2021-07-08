package com.eomcs.pms;
import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    System.out.println("[프로젝트]");

    Scanner scan = new Scanner(System.in);

    final int MAX_LENGTH =50;
    int no[]=new int[MAX_LENGTH];
    String title [] = new String [MAX_LENGTH];
    String content [] = new String [MAX_LENGTH]; 
    Date[] startDate = new Date[MAX_LENGTH];
    Date[] endDate = new Date[MAX_LENGTH];


    String owner[] = new String[MAX_LENGTH];
    String member[] = new String[MAX_LENGTH];

    int size=0;

    for(int i=0; i<MAX_LENGTH; i++) {     
      size= size+1;
      System.out.print("번호? ");    
      no[i]=Integer.parseInt(scan.nextLine()); 
      System.out.print("프로젝트명? ");
      title[i]=scan.nextLine();
      System.out.print("내용? ");
      content[i]=scan.nextLine();
      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(scan.nextLine());
      //startDate[i] = new Date();     
      // Date startDate = Date.valueOf(keyboardScan.nextLine());
      System.out.print("종료일? ");
      //Date endDate = Date.valueOf(scan.nextLine());
      endDate[i] = Date.valueOf(scan.nextLine());
      //endDate[i] = new Date();
      System.out.print("만든이? ");
      owner[i] = scan.nextLine();
      System.out.print("팀원? ");
      member[i] = scan.nextLine();

      System.out.println("멈추려면 q");
      String input=scan.next();
      if(input.equals("q")) {
        break;
      }
    }

    scan.close();

    System.out.println("--------------------------------");

    for(int i=0; i<size; i++) {   
      System.out.printf("번호: %d\n", no[i]);
      System.out.printf("프로젝트명: %s\n", title[i]);
      System.out.printf("내용: %s\n", content[i]);
      System.out.printf("시작일: %s\n", startDate[i]);
      System.out.printf("종료일: %s\n", endDate[i]);
      System.out.printf("만든이: %s\n", owner[i]);
      System.out.printf("팀원: %s\n", member[i]);
    }
  }}
