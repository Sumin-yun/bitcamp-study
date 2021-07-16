package com.eomcs.pms;

import com.eomcs.pms.handler.MemberHandle;
import com.eomcs.pms.handler.ProjectHandle;
import com.eomcs.pms.handler.TaskHandle;
import com.eomcs.pms.util.Prompt;

public class App {

  public static void main(String[] args) {

    loop:
      while (true) {
        String command = Prompt.inputString("명령> ");

        switch (command) {
          case "/member/add":
            MemberHandle.add();
            break;
          case "/member/list":
            MemberHandle.list();
            break;
          case "/project/add":
            ProjectHandle.add();
            break;
          case "/project/list":
            ProjectHandle.list();
            break;
          case "/task/add":
            TaskHandle.add();
            break;
          case "/task/list":
            TaskHandle.list();
            break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }    
  }






}
