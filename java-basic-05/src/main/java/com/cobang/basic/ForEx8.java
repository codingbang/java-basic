package com.cobang.basic;

public class ForEx8 {
  public static void main(String[] args) {
    for (int i=1;i<=9;i++){
      if(i==1){
        for (int j=2;j<=9;j++){
          System.out.printf("==%d단==\t",j);
        }
        System.out.println();
      }
      for (int j=2;j<=9;j++){
        System.out.printf("%d*%d=%d\t",i,j,(i*j));
      }
      System.out.println();
    }
  }
}
