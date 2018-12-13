# Java Data Type

### 01. 주석과 변수 선언

- 자바에서 주석 
  - // : 한줄
  - /* */ : 여러줄
- 변수선언 Type 변수명;
  - ex) int num;

### 02.Data Type

- literal 리터럴(변수에 할당한 값 타입)
- java에는 기본형 타입과 참조형 타입이 있다.
  - 기본형 타입
    - 정수형(byte, short, int, long)
      - DataTypeEx1.java 파일
    - 실수형(float, double)
      - DataTypeEx2.java 파일
    - 문자형(char) : 단일 문자, 아스키코드(7비트), 유니코드(16비트) 값을 넣어 표현가능
      - DataTypeEx3.java 파일
    - 논리형(boolean) : true, false
      - DataTypeEx4.java 파일
  - 참조형 타입
    - String(문자열형)
      - DataTypeEx5.java 파일
    - Arry(배열)
    - Class
    - Interface
    - enum
    - `배열, Class, Interface, enum`내용 은 다음에 다룰 예정.

### 03. 변수의 유효범위(Scope)
- 1.지역(local) 변수
	- 메소드내에 정의 된 변수
	- { } (지역범수의 범위)브레이스 블락
	- 지역 변수는 초기화를 꼭 시켜야한다.
- 2.인스턴스 변수
- 3.클래스(static) 변수