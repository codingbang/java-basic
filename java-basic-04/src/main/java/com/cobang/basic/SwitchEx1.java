package com.cobang.basic;

public class SwitchEx1 {
  public static void main(String[] args) {
    String dayofweek = "MON"; //문자열형 dayofweek 선언 "MON" 초기화
    String temp = ""; //문자열형 temp 선언 "" 초기화
    switch(dayofweek) { //dayofweek가
      case "SUN": //"SUN"일 경우
        temp = "일요일"; //temp는 "일요일"로 참조
        break; //종료
      case "MON": //아래 내용은 위와 같음
        temp = "월요일";
        break;
      case "TUE":
        temp = "화요일";
        break;
      case "WEN":
        temp = "수요일";
        break;
      case "THU":
        temp = "목요일";
        break;
      case "FRI":
        temp = "금요일";
        break;
      case "SAT":
        temp = "토요일";
        break;
    }
    System.out.printf("temp : %s%n",temp); //temp에 참조되어 있는 문자열 출력
  }
}
