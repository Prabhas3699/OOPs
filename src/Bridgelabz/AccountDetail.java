package Bridgelabz;

import java.util.Scanner;

public class AccountDetail {

	/*
	 * initialize variables
	 */
	int accountBalance=1000;
	Scanner sc=new Scanner(System.in);

	/*
	 * @return the accountBalance
	 */
	public int getAccountBalance() {
		return accountBalance;
	}

	/*
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	/**
	 * 
	 */
	public static void viewAmount() {
		AccountDetail s=new AccountDetail();
		System.out.println("Your account balance: "+s.getAccountBalance());
	}

	public void addBalance() {
		
		System.out.println("Enter the Amount to be credited:");
		int creditAmount=sc.nextInt();
		accountBalance+=creditAmount;
		System.out.println("Amout credited Successfully");
		System.out.println("Press \'1\' to view Balance");
		int n=sc.nextInt();
		if (n==1) {
			System.out.println("Your Account Balance :"+accountBalance);
		}
	}
	
	public void withDraw() {
		System.out.println("Enter the Amount to be debited:");
		int debitAmount=sc.nextInt();
		
		if(debitAmount<=0) {
			System.out.println("Invalid Amount... \n Please Enter the Valid Amount");
		}else if (debitAmount>accountBalance) {
			System.out.println("Insufficient Balance...");
		}else {
		accountBalance-=debitAmount;
		System.out.println("Amout debited Successfully");
		System.out.println("Press \'1\' to view Balance");
		int n=sc.nextInt();
		if (n==1) {
			System.out.println("Your Account Balance :"+accountBalance);	
		}
		}
		
	}
	
}
