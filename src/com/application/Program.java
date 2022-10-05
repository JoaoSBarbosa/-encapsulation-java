package com.application;

import java.util.Locale;
import java.util.Scanner;
import com.entities.Account;

public class Program {

	public static void main(String[] args) {

		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		

		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		if (resp == 'y') {	
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
				
		} else {
			account = new Account(number, holder);
		}

		
		/*System.out.println();
		System.out.println("Account data:");
		System.out.println("Account " + account.getNumber() 
		                    + ", Holder: " 
				            + account.getHolder() 
				            + ", Balance: $ " 
				            + account.getBalance());*/

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		// Deposito
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		// Saque
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		//System.out.println();
		
		sc.close();

	}

}
