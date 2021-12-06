// 스프링 IoC 컨테이너 사용
package com.eomcs.spring.ioc.ex01.b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Exam01 {
  public static void main(String[] args) {
    // 2) FileSystemXmlApplicationContext = 운영체제의 파일 시스템에서 설정 파일을 찾는 IoC 컨테이너
    // => 자바 classpath가 아닌 다른 폴더에 설정파일이 있을 경우 사용한다.
    // => 설정 파일 경로를 지정할 때 파일 시스템 경로를 지정해야 한다.
    // => 단, URL 형식으로 지정해야 한다.
    // => 예) file://설정파일경로
    // => URL 형식에서는 파일 시스템을 가리킬 때 접두어 'file://'를 붙인다.

    ApplicationContext iocContainer = new FileSystemXmlApplicationContext(//
        "file:/User/sumin/git/bitcamp/java-basic/bin/main/com/eomcs/spring/ioc/ex01/b/application-context.xml");
    //오류!
    //파일의 실제 경로를 지정하라. bitcamp/java-basic/bin/main/com/eomcs ....
    System.out.println("실행 완료!");
  }
}


