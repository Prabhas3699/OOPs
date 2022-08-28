package Bridgelabz;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		AccountDetail bankAccount=new AccountDetail();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter \'1\'  Add Balance");
			System.out.println("Enter \'2\' Withdraw Balance");
			System.out.println("Enter \'3\' View Balance");
			System.out.println("\nEnter the option:");
			int n = sc.nextInt();
		
		if (n==1) {
			bankAccount.addBalance();
		}
		else if(n==2) {
			bankAccount.withDraw();
		}
		else if (n==3) { 
			bankAccount.viewAmount();
		}
		else {
			System.out.println("Transcation cancelled");
			break;
		}
		}
	}		
}
