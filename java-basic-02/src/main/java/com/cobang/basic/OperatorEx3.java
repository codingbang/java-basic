package com.cobang.basic;

public class OperatorEx3 {
    public static void main(String[] args) {
      int num1 = 5, num2 = 10;

      boolean result = num1 > num2;
      System.out.printf("result = %b%n",result);
      
      result = num1 == num2;
      System.out.printf("result = %b%n",result);

      result = num1 != num2;
      System.out.printf("result = %b%n",result);

      result = num1 <= num2;
      System.out.printf("result = %b%n",result);
    }
}
