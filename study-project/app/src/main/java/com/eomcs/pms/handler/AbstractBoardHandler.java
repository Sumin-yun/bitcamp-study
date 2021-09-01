package com.eomcs.pms.handler;

import java.util.List;
import com.eomcs.pms.domain.Board;

public abstract class AbstractBoardHandler {
  //직접 인스턴스를 만들지 말고 상속받아 사용해라

  protected List<Board> boardList;

  public AbstractBoardHandler(List<Board> boardList) {
    this.boardList = boardList;
  }

  protected Board findByNo(int no) {
    for (Board board : boardList) {
      if (board.getNo() == no) {
        return board;
      }
    }
    return null;
  }
}








