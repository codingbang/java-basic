package com.cobang.basic;

public class IfEx6 {
  public static void main(String[] args) {
    int num = -2;

    if (num == 0){ //num이 0일 경우
      System.out.printf("%d는 0입니다.",num);
    } else if (num < 0){ //0보다 작을경우
      System.out.printf("%d는 음수입니다.",num);
    } else { //0보다 클경우
      System.out.printf("%d는 양수입니다.",num);
    }
  }
}
