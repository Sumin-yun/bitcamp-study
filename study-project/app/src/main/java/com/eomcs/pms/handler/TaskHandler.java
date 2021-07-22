package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Task;
import com.eomcs.util.Prompt;

public class TaskHandler {

  static final int MAX_LENGTH = 5;

  Task[] tasks = new Task[MAX_LENGTH];
  int size = 0;

  //다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.

  public void add(MemberHandler memberHandler) {
    System.out.println("[작업 등록]");

    Task task = new Task();

    task.no = Prompt.inputInt("번호? ");
    task.content = Prompt.inputString("내용? ");
    task.deadline = Prompt.inputDate("마감일? ");

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    task.status = Prompt.inputInt("> ");

    while(true) {
      String owner = Prompt.inputString("담당자? ");

      if (owner.length() == 0){
        System.out.println("등록을 취소합니다.");
        return;
      } else if (memberHandler.exist(owner)) {
        task.owner = owner;  
        break;
      }
      System.out.println("등록된 회원이 아닙니다.");
    }

    this.tasks[this.size++] = task;
  }

  //다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.
  public void list() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < this.size; i++) {
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

      System.out.printf("%d, %s, %s, %s, %s\n",
          this.tasks[i].no, 
          this.tasks[i].content, 
          this.tasks[i].deadline, 
          stateLabel, 
          this.tasks[i].owner);
    }

  }

  public void detail() {
    System.out.println("[작업 상세보기]");
    int no = Prompt.inputInt("번호?"); 

    Task task = null;

    for(int i = 0; i < this.size; i++) {
      if(no == tasks[i].no) {
        task = tasks[i];
        break;
      }
    }
    if(task == null) {
      System.out.println("해당 번호의 작업이 없습니다.");
      return;
    }

    System.out.printf("내용:%s", task.content);
    System.out.printf("담당자:%s", task.owner);
    System.out.printf("상태:%s", task.status);

  }

  public void update() {
    System.out.println("[작업 상세보기]");
    int no = Prompt.inputInt("번호?"); 

    Task task = null;

    for(int i = 0; i < this.size; i++) {
      if(no == tasks[i].no) {
        task = tasks[i];
        break;
      }
    }

    if(task == null) {
      System.out.println("해당 번호의 작업이 없습니다.");
      return;
    }

    String title = Prompt.inputString(String.format("내용(%s)", task.content));
    String writer = Prompt.inputString(String.format("작성자(%s)", task.owner));

    String input = Prompt.inputString("정말 변경하시겠습니까? (y/n)");

    if(input.equalsIgnoreCase("n") || input.length() == 0 ) {
      System.out.println("작업 변경을 취소합니다.");
      return;
    }

    task.content = title;
    task.owner = writer;
    System.out.println("작업을 변경했습니다.");
  }

  public void delete() {
    System.out.println("[작업 삭제]");
    int no = Prompt.inputInt("번호?"); 

    int boardIndex = -1;

    for(int i = 0; i<this.size; i++ ) {
      if(no == this.tasks[i].no) {
        boardIndex = no;
        break;
      }
    }

    if(boardIndex == -1) {
      System.out.println("해당 번호의 작업이 없습니다.");
      return;
    }

    String input = Prompt.inputString("정말 삭제하시겠습니까?");
    if (input.equalsIgnoreCase("n") || input.length() == 0 ) {
      System.out.print("삭제를 취소하였습니다.");
      return;
    }


    for(int i = boardIndex + 1; i < this.size; i++) {
      this.tasks[i-1] = tasks[i];
    }

    this.tasks[--this.size] = null;    

    System.out.println("게시글을 삭제하였습니다.");
  }

}


