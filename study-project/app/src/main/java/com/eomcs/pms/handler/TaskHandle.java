package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Task;
import com.eomcs.pms.util.Prompt;

public class TaskHandle {

  static final int LENGTH = 10; 
  static Task[] tasks = new Task[LENGTH];
  static int size = 0;

  public static void add() {

    Task task = new Task();
    System.out.println("[작업 등록]");

    task.no = Prompt.inputInt("번호? ");
    task.content = Prompt.inputString("내용? ");
    task.deadline = Prompt.inputDate("마감일? ");
    task.status = Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    task.owner = Prompt.inputString("담당자? ");

    tasks[size++] = task;
  }

  public static void list() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < size; i++) {
      String stateLabel = null;
      switch (tasks[i].status) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          tasks[i].no, tasks[i].content, tasks[i].deadline, stateLabel, tasks[i].owner);
    }
  }
}
