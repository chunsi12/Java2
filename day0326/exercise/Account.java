package day0326.exercise;

public class Account {
	
	private String account;
	private int balance;
	private double interestRate;
	
	public Account () {}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public int getBalance() {
		return balance;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	public double calculateInterest() {
		return balance * (interestRate * 0.01);
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		balance -= money;
	}

	@Override
	public String toString() {
		return "Account [account=" + account + ", balance=" + balance + "]";
	}
	
	}
	



	
	
	


