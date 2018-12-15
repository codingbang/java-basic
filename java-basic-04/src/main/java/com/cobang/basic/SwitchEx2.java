package com.cobang.basic;

public class SwitchEx2 {
  public static void main(String[] args) {
    int day = 8; //정수형 day선언 8로 초기화
    String temp = ""; //문자열형 temp선언 ""로 초기화

    switch(day) { //day가
      case 1: //값이 1이면
        temp = "일요일"; //temp에 "일요일" 참조
        break; //종료
      case 2: //아래 내용은 위와 같음
        temp = "월요일";
        break;
      case 3:
        temp = "화요일";
        break;
      case 4:
        temp = "수요일";
        break;
      case 5:
        temp = "목요일";
        break;
      case 6:
        temp = "금요일";
        break;
      case 7:
        temp = "토요일";
        break;
      default: //case 외의 것이면
        temp = "1~7사이의 숫자를 입력하지 않았습니다."; //temp에 문자열 참조
        break; //있어도되고 없어도됨
    }
    System.out.printf(temp); //temp에 현재 참조되어있는 문자열 출력
  }
}
