package com.cobang.basic;

//계좌 관리 프로그램
public class AccountTest {
  public static void main(String[] args) {
      
      //은행명을 조회하여 출력하시오.
      //System.out.printf("%s%n",Account.bankName);
      System.out.printf("%s%n",Account.getBankName());

      System.out.println();

      //매개변수 생성자(초기화) 예제
      Account obj1 = new Account("1111","일길동","1234",1000);
      Account obj2 = new Account("2222","이길동","5678",2000);

      System.out.println("매개변수 생성자 연습");
      //1. 계좌번호가 1111인 고객 계좌의 잔고를 조회하여 출력하시오
      System.out.printf("계좌1 잔고 : %,d%n",obj1.getBalance()); // ,%d : 참조

      //2. 계좌번호가 2222인 고객 계좌의 잔고를 조회하여 출력하시오
      System.out.printf("계좌2 잔고 : %,d%n",obj2.getBalance());

      //3. 계좌번호가 2222인 고객 계좌로 2000원을 입금 후 잔고를 출력하시오.
      obj2.setDeposit(2000);
      System.out.printf("계좌2 입금 후 잔고 : %,d%n",obj2.getBalance());
      
      //4. 계좌번호 1111인 고객 계좌의 1000원을 출금 후 잔고를 출력하시오.
      obj1.setWithdraw(1000);
      System.out.printf("계좌1 출금 후 잔고 : %,d%n",obj1.getBalance());
      
      //5. 계좌번호 1111인 고객의 비밀번호를 9012로 변경 후 출력하시오.
      System.out.printf("계좌1 비밀번호 변경 전  : %s%n",obj1.getPwd());
      obj1.setPwd("9012");
      System.out.printf("계좌1 비밀번호 변경 후  : %s%n",obj1.getPwd());
      
      //6. 계좌번호가 2222인 고객 계좌에서 계좌번호가 1111인 고객계좌로
      //1000원을 이체하시오.
      obj2.setTransferAccount(obj1, 1000);
      //obj2.(this.생략 = obj2)setTransferAccount
      System.out.printf("계좌2 이체 후 잔고 : %,d%n",obj2.getBalance());
      System.out.printf("계좌1 입금 후 잔고 : %,d%n",obj1.getBalance());
  
      
      System.out.println();
      

      //걔좌1 객체 선언 및 생성
      Account acc1 = new Account();

      //계좌 1
      System.out.println("계좌1의 정보입니다.");
      
      //고객명 변경
      acc1.setName("자바개발자");
      
      //변경된 고객명 조회
      System.out.printf("계좌1 고객명 : %s%n",acc1.getName());

      //계좌번호 조회 및 변경
      acc1.setNumber("24400-04-229412");
      System.out.printf("계좌1 계좌번호 : %s%n",acc1.getNumber());

      //비밀번호 조회 및 변경하기.
      acc1.setPwd("5555");
      System.out.printf("계좌1 비밀번호 : %s%n",acc1.getPwd());
      
      //입금하기
      acc1.setDeposit(20200);
      System.out.printf("계좌1 입금 후 잔고 : %s원%n",acc1.getBalance());
      
      //출금하기.
      acc1.setWithdraw(5000);
      System.out.printf("계좌1 출금 후 잔고 : %s원%n",acc1.getBalance());

      

      System.out.println();

      //걔좌2 객체 선언 및 생성
      Account acc2 = new Account();
      
      //계좌2
      System.out.println("계좌2의 정보입니다.");
      //고객명 설정 및 조회
      acc2.setName("프레임워크");
      System.out.printf("계좌2 고객명 : %s%n",acc2.getName());
      
      //계좌2 번호 설정 및 조회
      acc2.setNumber("110-386-610048");
      System.out.printf("계좌2 계좌번호 : %s%n",acc2.getNumber());

      //계좌2 비밀번호 설정 및 조회
      acc2.setPwd("1234");
      System.out.printf("계좌2 비밀번호 : %s%n",acc2.getPwd());
      
      //계좌2 입금 및 잔고 조회
      acc2.setDeposit(9800);
      System.out.printf("계좌2 입금 후 잔고 : %s원%n",acc2.getBalance());
      
      //계좌2 출금 및 잔고 조회
      acc2.setWithdraw(1540);
      System.out.printf("계좌2 출금 후 잔고 : %s원%n",acc2.getBalance());

      System.out.println();

      //계좌이체 하기 계좌1에서 계좌2로 입금
      acc1.setTransferAccount(acc2, 5000);
      System.out.printf("계좌2로 이체 후 계좌1의 잔고 : %s원%n",acc1.getBalance());
      System.out.printf("계좌2로 이체 후 계좌2의 잔고 : %s원%n",acc2.getBalance());
      
      System.out.println();

      //계좌이체 하기 계좌2에서 계좌1로 입금
      acc2.setTransferAccount(acc1, 5000);
      System.out.printf("계좌1로 이체 후 계좌1의 잔고 : %s원%n",acc1.getBalance());
      System.out.printf("계좌1로 이체 후 계좌2의 잔고 : %s원%n",acc2.getBalance());

  }
}
