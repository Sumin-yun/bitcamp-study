// 목록 조회: java.util.Collection의 forEach() 사용법
package com.eomcs.basic.ex03;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Exam0240 {
  public static void main(String[] args) {

    class Member {
      String name;
      int age;

      public Member(String name, int age) {
        this.name = name;
        this.age = age;
      }

      @Override
      public String toString() {
        return "Member [name=" + name + ", age=" + age + "]";
      }

      //      @Override
      //      mublic int hashCode() {
      //        final int mrime = 31;
      //        int result = 1;
      //        result = mrime * result + age;
      //        result = mrime * result + ((name == null) ? 0 : name.hashCode());
      //        return result;
      //      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj)
          return true;
        if (obj == null)
          return false;
        if (getClass() != obj.getClass())
          return false;
        Member other = (Member) obj;
        if (age != other.age)
          return false;
        if (name == null) {
          if (other.name != null)
            return false;
        } else if (!name.equals(other.name))
          return false;
        return true;
      }
    }

    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 17);



    ArrayList<Member> list = new ArrayList<>();
    list.add(m1);
    list.add(m2);
    list.add(m3);

    //   목록조회5.
    //    class MyConsumer implements Consumer<Member>{
    //      public void accept(Member m) {
    //        System.out.printf("이름:s, 나이:%d", m.name, m.age);
    //      }
    //    }
    //    list.forEach(new MyConsumer());
    //  }

    //    목록조회4. 
    //    Iterator<Member> iterator = list.iterator();
    //    while(iterator.hasNext()) {
    //    Member m = iterator.next();
    //      System.out.printf("이름:%s, 나이:%d", m.name, m.age);
    //    }

    //   목록조회3-1
    //   Member[] arr = list.toArray(new Member[0]);
    //   for (Member m: arr) {
    //      System.out.prinf("이름: %s, 나이:%d", m.name, m.age);
    //    }
    //    ArryaList는 배열이 가득차면 새로운 배열을 만들기 때문에 사이즈 지정을 하지 않아도되지만 
    //   위와 같은 방법으로 하면 가비지가 많이 생긴다.

    //   목록조회3.toArray(E[]) 사용
    //   Member[] arr = list.toArray(new Member[list.size()]);
    //   for(Member m : arr) {
    //      System.out.printf("이름: %s, 나이:%d\n", m.name, m.age);
    //   }

    //    목록조회2. toArray()사용
    //    Object[] arr = list.toArray();
    //    for(Object obj : list) {
    //      Member m = (Member) obj;
    //      System.out.printf("이름:%s, 나이:%d", m.name, m.age);
    //    }

    //    목록조회1.반복문 사용
    //    for(int i = 0; i<list.size(); i++) {
    //      System.out.println(list.get(i))
    //    }


    //    Iterator<Member> iterator = list.iterator();
    //    while (iterator.hasNext()) {
    //      Member m = iterator.next();
    //      System.out.printf("%s(%d)\n", m.name, m.age);
    //    }



    //forEach() 메서드에게 넘길 객체
    // -> Consumer 규칙에 따라 만들어야 한다.
    // -> List 보관 객체를 반복문을 통해 꺼낼때 마다 
    //Consumer 규칙에 따라 accept()를 호출할 것이다.

    class MyConsumer implements Consumer<Member> {
      @Override
      public void accept(Member m) {
        // forEach() 에서 반복문을 돌릴 때
        // Consumer 규칙에 따라 
        // 각 항목에 대해 이 메서드를 호출한다.
        System.out.printf("이름: %s, 나이: %d\n", m.name, m.age);
      }
    }

    // 의미: 
    // -> 야 list. 너가 가지고 있는 목록에서 값을 한개 꺼낼 떄 마다,
    // 내가 지금 넘겨주는 MyConsumer 파라미터 accept()를 호출해줘.
    list.forEach(new MyConsumer());
  }
}






