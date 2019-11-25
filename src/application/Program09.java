package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many products? ");
		int quant = sc.nextInt();		
		Product[] vect = new Product[quant];
		
		for (int i = 0; i < vect.length; i++) {			
			System.out.print("Enter name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Enter price: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f", avg);
		
		sc.close();
	}
}
