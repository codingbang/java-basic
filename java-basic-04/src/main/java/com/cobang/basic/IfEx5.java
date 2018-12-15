package com.cobang.basic;

public class IfEx5 {
  public static void main(String[] args) {
    int num = 4;

    if(num == 1) { //num이 1인경우
      System.out.printf("%d 입니다.",num);
    } else if(num == 2) { //2일 경우
      System.out.printf("%d 입니다.",num);
    } else if(num == 3) { //3일 경우
      System.out.printf("%d 입니다.",num);
    }else { //1,2,3 이 아닌경우
      System.out.printf("1,2,3이 아닙니다.",num);
    }
  }
}
