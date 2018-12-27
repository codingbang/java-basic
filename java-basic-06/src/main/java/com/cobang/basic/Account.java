package com.cobang.basic;

//계좌정보를 구현한 클래스
public class Account {

  //인스턴스 변수
  String number;
  String name;
  String pwd;
  long balance;
  //클래스(static) 변수
  static String bankName;

  //클래스변수 초기화
  static {
      System.out.println("call static initialize block");
      bankName = "my은행";
  }


  //디폴트 생성자 메소드
  public Account() {
      System.out.println("call default constructor method!!");
  }

  //매개변수 생성자 메소드
  public Account(String number, String name, String pwd, long balance) { //매개변수 설정후 초기화시 순서대로 해야한다.
      this.number = number;
      this.name = name;
      this.pwd = pwd;
      this.balance = balance;
  }

  //인스턴스 메소드
  //예금주 조회 및 변경
  public String getName() {
      return name;
  }
  public void setName(String name) {
      this.name = name;
  }

  //잔고 조회
  public long getBalance(){
      return balance;
  }

  //잔고 변경
  public void setBalance(long balance){
      this.balance = balance;
  }

  //비밀번호 조회
  public String getPwd() {
      return pwd;
  }

  //비밀번호 변경 setPwd
  public void setPwd(String pwd) {
      this.pwd=pwd;
  }

  //계좌번호 조회 및 변경
  public String getNumber() {
      return number;
  }

  public void setNumber(String number) {
      this.number = number;
  }

  //입금 deposit
  public void setDeposit(long amount) {  //리턴할 값이 필요 없어 void , 금액을 받아야하니 long deposit
      balance += amount;
  }

  //출금 withdraw
  public void setWithdraw(long amount) {
      balance -= amount;
  }


  //계좌이체 tranferAccount 계좌1에서 출금하는 경우
  public void setTransferAccount(Account acc, long trancefer) { 
      //Account acc = new Account(); 레퍼런스 데이터 타입을 가진 객체 생성
      acc.setDeposit(trancefer); //acc에게 tracefer만큼 입금
      this.setWithdraw(trancefer); //trancefer만큼 출금
      //즉 클래스안에서도 객체를 생성하고 정의된 인스턴스 메소드를 참조해서 쓴다.


  /*
  public void transfer(Account acc, long trancefer) { 
    balance -= trancefer; //잔고를 trancefer만큼 출금
    acc.deposit(trancefer); //acc에게 trancefer만큼 입금
    } */
  }

  public static String getBankName() {
          return  bankName;
  } 
}