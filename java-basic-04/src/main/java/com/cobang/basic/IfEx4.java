package com.cobang.basic;

public class IfEx4 {
  public static void main(String[] args) {
    char gender = 'm';
    if(gender == 'M' || gender == 'm'){ //gender가 'M' 이거나 'm'일 경우
      System.out.printf("%c은(는) 남자입니다.",gender); //조건에 맞으면 출력
    } else {
      System.out.printf("%c은(는) 여자입니다.",gender); //그렇지 않으면 출력
    }
  }
}
