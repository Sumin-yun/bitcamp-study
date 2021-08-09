package com.eomcs.pms.menu;

import com.eomcs.util.Prompt;

// 역할
// - 다른 메뉴를 포함하는 컨테이너 역할을 수행한다.
// 
public class MenuGroup extends Menu {

  Menu[] childs = new Menu[100];
  int size;
  boolean disablePrevMenu;
  String prevMenuTitle = "이전 메뉴";

  public MenuGroup(String title){
    super(title);       // 슈퍼 클래스인 Menu 생성자의 파라미터와 맞춰준다.
  }

  public MenuGroup(String title, boolean disablePrevMenu) {
    super(title);
    this.disablePrevMenu = disablePrevMenu;
  }

  public void setPrevMenuTitle(String prevMenuTitle) {
    this.prevMenuTitle = prevMenuTitle;
  }

  public void add(Menu child) {     //하위 메뉴 생성 메서드.
    if (this.size == this.childs.length) {
      return;               //하위 메뉴가 꽉차면 리턴.
    }
    this.childs[this.size++] = child;
  }

  public Menu remove(Menu child) {
    int index = indexOf(child);
    if (index == -1) {
      return null;
    }
    for (int i = index + 1; i < this.size; i++) {       //1번 인덱스부터 시작.
      this.childs[i-1] = this.childs[i];                
    }
    childs[--this.size] = null;
    return child;
  }

  public int indexOf(Menu child) {
    for (int i = 0; i<this.size; i++) {
      if (this.childs[i] == child ) {
        return i;
      }
    }
    return -1;
  }

  public Menu getMenu(String title) {
    for(int i = 0; i< this.size ; i++) {
      if(this.childs[i].title.equals(title)) {
        return this.childs[i];
      }
    }
    return null;
  }

  @Override
  public void execute() {
    while(true) {
      System.out.printf("\n[%s]\n", this.title);
      for(int i =0; i<this.size ; i++) {
        System.out.printf("%d. %s\n", i+1, this.childs[i].title);
      }
      if(!disablePrevMenu) {
        System.out.printf("0. %s\n", this.prevMenuTitle);
      }

      int menuNo = Prompt.inputInt("선택 >");
      if (menuNo == 0 && !disablePrevMenu) {
        return;
      }

      if(menuNo < 0 || menuNo > this.size) {
        System.out.println("무효한 메뉴 변호입니다.");
        continue;
      }

      this.childs[menuNo - 1].execute();
    }
  }

}
