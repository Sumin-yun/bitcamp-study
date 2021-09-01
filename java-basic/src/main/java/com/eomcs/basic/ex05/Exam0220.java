// Stack과 Deque
package com.eomcs.basic.ex05;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Exam0220 {

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

    //Stack과 다르게 Deque의 Iterator는(LIFO) 스택방식으로 데이터를 꺼낸다.


    Iterator<String> iterator = stack.iterator();

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }



  }

}

