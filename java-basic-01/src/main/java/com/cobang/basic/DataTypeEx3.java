package com.cobang.basic;

public class DataTypeEx3 {
    public static void main(String[] args) {
      //기본형 - 문자형 타입
      
      char ch = 'a';
      System.out.println("ch=" + ch);
      
      char ch1 = 65; //아스키코드 값
      System.out.println("ch1 = " + ch1);
      char ch2 = 'A'; //문자
      System.out.println("ch2 = " + ch2);
      char ch3 = '\u0041'; //유니코드 값
      System.out.println("ch3 = " + ch3);
      
      
      //문자형 타입 a를 아스키코드와 유니코드로 표현하기
      char ch4 = 'a';
      System.out.println("ch4 = " + ch4);
      char ch5 = 97;
      System.out.println("ch5 = " + ch5);
      char ch6 = '\u0061';
      System.out.println("ch6 = " + ch6);
    }
}
