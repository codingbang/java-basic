package com.cobang.basic;

public class DataTypeEx6 {
    public static void main(String[] args) {
      //종합
      
      //이름
      String name = "이종현";
      //나이
      int age = 25;
      //성별 : '남', '여'
      char gen = '남';
      //결혼여부 : 기혼인경우 ture, 미혼인경우 false
      boolean mar = false;
      //키 : 소수점이하 한자리
      float height = 169.9f;
      System.out.println("이름: " + name + " 나이: " + age + " 성별: " + gen + " 결혼여부: " + mar + " 키: " + height);
      System.out.printf("이름 : %s, 나이 : %d, 성별 : %c, 결혼여부 : %b, 키 : %.1f%n", name,age,gen,mar,height);
    }
}
