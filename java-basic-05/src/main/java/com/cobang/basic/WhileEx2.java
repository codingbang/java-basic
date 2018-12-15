package com.cobang.basic;

import java.util.Scanner;

public class WhileEx2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("이름을 입력하세요 [종료시 : quit] ");
    String name = scan.nextLine();

    while(!name.equals("quit")) { //name != "quit"
      System.out.printf("당신의 이름은 %s 입니다.%n",name);

      System.out.println("이름을 입력하세요 [종료시 : quit] ");
      name = scan.nextLine();
    }
  }
}
