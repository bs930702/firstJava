package com.yedam.lch;

import java.util.Scanner;

public class AccountExample {

	Account[] acntAry = new Account[5];
	Scanner sc = new Scanner(System.in);

	void createAccount() {
		System.out.println("신규");
		System.out.println("계좌번호를 입력하세요.");
		String accNo = sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("금액을 입력하세요.");
		int balance = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] == null) {
				acntAry[i] = new Account(accNo, name, balance);
				break;
			}
		}
	}

	void deposit() {
		System.out.println("입금");
		System.out.println("계좌번호를 입력하세요.");
		String accNo = sc.nextLine();
		System.out.println("입금금액을 입력하세요.");
		int money = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry != null && acntAry[i].getAccountNo().equals(accNo)) {
				acntAry[i].deposit(money);
				break;
			}
		}
	}

	void withdraw() {
		System.out.println("출금");
		System.out.println("계좌번호를 입력하세요.");
		String accNo = sc.nextLine();
		System.out.println("출금금액을 입력하세요.");
		int money = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry != null && acntAry[i].getAccountNo().equals(accNo)) {
				acntAry[i].withdraw(money);
				break;
			}
		}
	}

	void checkBalance() {
		System.out.println("잔액확인");
		System.out.println("계좌번호를 입력하세요.");
		String accNo = sc.nextLine();
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry != null && acntAry[i].getAccountNo().equals(accNo)) {
				acntAry[i].checkBalance();
				break;
			}
		}
	}

	void allAccount() {
		System.out.println("조회");
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null)
				acntAry[i].checkBalance();
		}
	}

	void execute() {
		// 메뉴 ...1)신규 2)입금 3)출금 4)잔액확인5)조회6)종료

		int menu = 0;
		while (true) {
			System.out.println("메뉴를 선택하세요.1)신규 2)입금 3)출금 4)잔액확인 5)조회 6)종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				deposit();
			} else if (menu == 3) {
				withdraw();
			} else if (menu == 4) {
				checkBalance();
			} else if (menu == 5) {
				allAccount();
			} else {
				System.out.println("종료");
				break;
			}
		}
		System.out.println("프로그램이 종료되엇습니다.");
	}
}
