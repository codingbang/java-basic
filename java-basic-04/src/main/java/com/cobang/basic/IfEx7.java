package com.cobang.basic;

public class IfEx7 {
  public static void main(String[] args) {
    int score = 101;

    if(score < 0 || score > 100){ //score가 0보다 작거나 100보다 큰경우
      System.out.println("0~100사이의 점수가 아닙니다.");
      return; //메인 종료
    }

    if (score >= 90){ //90점 보다 크거나 같을 경우
      System.out.printf("%d점은 A학점 입니다.",score);
    } else if (score >= 80){ //80점 보다 크거나 같을 경우
      System.out.printf("%d점은 B학점 입니다.",score); //B학점 출력
    } else if (score >= 70){ //70점 보다 크거나 같을 경우
      System.out.printf("%d점은 C학점 입니다.",score); //C학점 출력
    } else if (score >= 60){ //60점 보다 크거나 같을 경우
      System.out.printf("%d점은 D학점 입니다.",score); //D학점 출력
    } else { //아니면
      System.out.printf("%d점은 F학점 입니다.",score); //F학점 출력
    }
  }
}
