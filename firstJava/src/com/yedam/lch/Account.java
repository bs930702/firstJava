package com.yedam.lch;

public class Account {
	// 계좌번호
	// 이름
	// 잔액
	private String accountNo;
	private String name;
	private int balance;

	Account() {
	}

	public Account(String accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	// 입금(deposit)
	// 출금(withdraw)
	// 잔액(checkBalance)
	void deposit(int money) {
		this.balance += money;
	}

	void withdraw(int money) {
		this.balance -= money;
	}

	void checkBalance() {
		System.out.println("계좌번호 " + this.accountNo + " 의 잔액은" + this.balance);
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	
	
}
