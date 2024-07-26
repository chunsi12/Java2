package day0326.exercise;

public class AccountTest {

	public static void main(String[] args) {
		Account account;
		account = new Account("441-0290-1230",500000,7.3);
		
		System.out.println(account);
		System.out.println("계좌정보 : "+account.getAccount()+", 현재잔액 : " + account.getBalance());
		
		account.deposit(20000);
		System.out.println("이자 : "+account.calculateInterest());
		
		

	}

}
