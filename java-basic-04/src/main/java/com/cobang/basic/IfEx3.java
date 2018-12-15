package com.cobang.basic;

public class IfEx3 {
  public static void main(String[] args) {
    int num = 10;
    if(num%2==0) { //num를 2로 나눈 나머지가 0 일경우 
      System.out.printf("%d는 짝수입니다.", num); //조건에 맞으면 출력
    } else {
      System.out.printf("%d는 홀수입니다.", num); //그렇지 않으면 출력
    }
  }
}
