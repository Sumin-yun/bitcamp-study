// Stack과 Deque
package com.eomcs.basic.ex05;

import java.util.ArrayDeque;

public class Exam0230 {

  public static void main(String[] args) {

    // Deque interface
    // 걊을 양방향에서 값을 넣고 꺼낼 수 있다.
    // 따라서 Queue 로도 사용 가능하고, stack으로도 사용 가능하다.
    //  

    ArrayDeque<String> stack = new ArrayDeque<>();

    // push() - 스택의 맨 마지막에 값을 추가한다.
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    //Iterator를 통해 데이터를 조회하고 싶다면,
    //for문이 더 편리하다.
    for(String s : stack) {
      System.out.println(s);
    }


  }

}

////08.27.목 여기까지.