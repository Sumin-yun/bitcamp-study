package com.eomcs.pms.handler;
import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {

  static final int LENGTH = 10;

  Board[] boards = new Board[LENGTH];
  int size = 0;

  public static void add(BoardHandler that) {
    System.out.println("[새 게시글]");

    Board board = new Board();

    board.no = Prompt.inputInt("번호?");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("작성자? ");
    board.viewCount = Prompt.inputInt("조회? ");
    board.registeredDate = new Date(System.currentTimeMillis());

    System.out.println("게시글을 등록하였습니다.");

    that.boards[that.size++] = board;
  }

  public static void list(BoardHandler that) {
    System.out.println("[회원 목록]");
    for (int i = 0; i < that.size; i++) {
      System.out.printf("%s, %s, %s, %d\n", 
          that.boards[i].title, 
          that.boards[i].writer, 
          that.boards[i].registeredDate, 
          that.boards[i].viewCount );   
    }
  }

}
