package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		Account acc;
		
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double amount = sc.nextDouble();
			
			 acc = new Account(number, holder, amount);
		}
		else {
			acc = new Account(number, holder);
		}
		
		System.out.println("\nAccount data:\n" + acc);
		
		System.out.print("\nEnter a deposit value: ");
		double amount = sc.nextDouble();
		acc.deposit(amount);
		System.out.println("Updated account data:\n" + acc);
		
		System.out.print("\nEnter a withdraw value: ");
		amount = sc.nextDouble();
		acc.withdraw(amount);
		System.out.println("Updated account data:\n" + acc);
		
		sc.close();
	}
}