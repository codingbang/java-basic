package com.cobang.basic;

import java.util.Scanner;

public class DoWhileEx3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = "";
    do{
      System.out.println("이름을 입력하세요 [종료:quit]");
      name = scan.nextLine();
      if (name.equals("quit")){
        break;
      }
      System.out.printf("당신의 이름은 %s 입니다.%n",name);
    }
    while (true);
  }
}
