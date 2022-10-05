package com.application;

import java.util.Locale;
import java.util.Scanner;
import com.entities.Conta;

public class Program {

	public static void main(String[] args) {

		double deposito = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		

		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		if (resp == 'y') {	
			System.out.print("Enter initial deposit value:");
			deposito = sc.nextDouble();
				
		} else {

		}

		Conta c1 = new Conta(conta, holder, deposito);
		System.out.println();
		System.out.println("Account data:");
		System.out.println("Account " + c1.getNumber() + ", Holder: " + c1.getHolder() + ", Balance: $ " + c1.getBalance());

		System.out.println();
	

		
		System.out.print("\nEnter a deposit value: ");
		c1.deposit(sc.nextDouble());
		c1.info();
		

		System.out.print("\nEnter a withdraw value: ");
		c1.withdraw(sc.nextDouble());
		c1.info();
		
		
		sc.close();

	}

}
