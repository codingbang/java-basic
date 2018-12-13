package com.cobang.basic;

public class OperatorEx4 {
    public static void main(String[] args) {
      boolean flag1 = true, flag2 = false;

      boolean result = flag1 && flag2;
      System.out.printf("result = %b%n",result);

      result = flag1 || flag2;
      System.out.printf("result = %b%n",result);

      result = flag1 || flag2;
      System.out.printf("result = %b%n",!result);
    }
}
