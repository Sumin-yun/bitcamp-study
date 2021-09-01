// Stack 클래스 사용법 - Iterator 사용
package com.eomcs.basic.ex05;

import java.util.Stack;

public class Exam0170 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    // push() - 스택의 맨 마지막에 값을 추가한다.
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    //stack도 iterable 구현체 이기 때문에
    //다음과 같이 for(:) 문을 사용할 수 있다.
    // - 내부적으로는 iterator를 호출하여 iterator를 얻은 후,이 iterator를 통해 값을 꺼낸다.
    // - 결국 1060번과 같다. 
    // - 즉 iterator를 사용할 것 인지, for (:) 문을 통해 간접적으로 처리 할것인지 선택하면 된다.
    for (String s : stack) {
      System.out.println(s);
    }

  }

}

