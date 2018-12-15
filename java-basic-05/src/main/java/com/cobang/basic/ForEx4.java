package com.cobang.basic;

public class ForEx4 {
  public static void main(String[] args) {
    //구구단 만들기
    int dan = 2;
    System.out.printf("%d단",dan);
    for (int i=1;i<=9;i++ ){
      System.out.printf("%d * %d = %d%n",dan,i,(dan*i));
    }
  }
}
