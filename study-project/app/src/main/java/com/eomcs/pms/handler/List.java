package com.eomcs.pms.handler;

//Generalization을 통해 슈퍼 클래스를 정의한 경우
//슈퍼클래스와 서브클래스의 공통 분모를 모아둔 경우이다. (직접 사용 X)
//즉 서브 클래스에게 공통 분모를 상속하기 위해 생성한 것.
//이런 경우 직접 인스턴스를 만들어 사용하지 않도록 "abstract Method"로 만드는 것이 낫다. 

public interface List {        

  //어차피 서브 클래스에서 목록을 다루는 방식에 따라 구현 방법이 다르다.
  //그러니 구현하지 말고 추상메서드로 선언. 

  //10-g/ List = ArrayList와 LinkedList를 한타입으로 묶기 위해 만든 클래스이다.
  //이렇게 뭔가를 상속한 후 역할은 하지 않고, 해야할 일만 강요하는 (객체 사용 규칙을 정의하는) 경우
  // "interface" 로 구현하는 것이 낫다.
  //interface: 모든 필드 (public, static, final)
  //          모든 메서드 (public abstract)



  void add (Object item) ;

  Object[] toArray() ;

  boolean remove(Object obj);

}
