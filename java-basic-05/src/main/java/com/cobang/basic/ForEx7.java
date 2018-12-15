package com.cobang.basic;

public class ForEx7 {
  public static void main(String[] args) {
    //중첩 for문을 이용해 구구단 만들기.
    for (int i=1;i<=9;i++){ //int i=3;i<=9;i+=2 홀수단만 출력하기.
      System.out.printf("=== %d단 ===%n",i);
      for (int j=1;j<=9;j++){
        System.out.printf("%d * %d = %d%n",i,j,(i*j));
      }
    }
  }
}
