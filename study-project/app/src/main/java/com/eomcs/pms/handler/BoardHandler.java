package com.eomcs.pms.handler;
import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {

  static final int LENGTH = 10;

  Board[] boards = new Board[LENGTH];

  int size = 0;

  public void add() {
    System.out.println("[새 게시글]");

    Board board = new Board();

    board.no = Prompt.inputInt("번호?");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("작성자? ");
    board.registeredDate = new Date(System.currentTimeMillis());

    System.out.println("게시글을 등록하였습니다.");

    this.boards[this.size++] = board;
  }

  public void list() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < this.size; i++) {
      System.out.printf("%s, %s, %s, %d\n", 
          this.boards[i].title, 
          this.boards[i].writer, 
          this.boards[i].registeredDate, 
          this.boards[i].viewCount );   
    }
  }

  public void detail() {

    System.out.println("[게시글 상세보기]");
    int no= Prompt.inputInt("번호?");

    Board board = null;

    for (int i = 0; i < this.size; i++) {
      if (no == boards[i].no) {
        board = boards[i];
        break;
      }
    }

    if(board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    System.out.printf("제목: %s \n",board.title);
    System.out.printf("내용: %s \n",board.content);
    System.out.printf("작성자: %s \n",board.writer);
    System.out.printf("등록일: %s \n",board.registeredDate);
    System.out.printf("조회수: %s \n",++board.viewCount);
  }


  public void update() {
    System.out.println("[게시글 변경]");
    int no= Prompt.inputInt("번호?");

    Board board = null;

    for (int i = 0; i < this.size; i++) {
      if (no == boards[i].no) {
        board=boards[i];
        break;
      }
    }   //입력한 번호가 no와 같으면 넘버를 저장.

    if(board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    String title = Prompt.inputString(String.format("제목(%s)", board.title));
    String content = Prompt.inputString(String.format("내용(%s)", board.content));

    String input = Prompt.inputString("정말 변경하시겠습까?(y/N)");
    if( input.equalsIgnoreCase("n") || input.length() == 0){
      System.out.println("게시글 변경을 취소하였습니다.");
      return;
    }

    board.title = title;
    board.content = content;
    System.out.println("게시글을 변경하였습니다.");

  }

  public void delete() {    
    System.out.println("[게시글 삭제]");
    int no= Prompt.inputInt("번호?");

    Board board = null;

    for (int i = 0; i < this.size; i++) {
      if (no == boards[i].no) {
        board=boards[i];
        break;
      }
    }   //입력한 번호가 no와 같으면 넘버를 저장.

    if(board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    String input = Prompt.inputString("정말 삭제 하시겠습니까?");

    if(input.equalsIgnoreCase("N") || input.length() == 0); {
      System.out.println("게시글 삭제를 취소하였습니다.");
      return;
    }

    /*
    for(int i=no+1; i<this.size; i++) {
      boards[no]=boards[i];
      size--;  
      break;
    }
     */


  } 

}


