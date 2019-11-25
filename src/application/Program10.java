package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program10 {

	public static final int ROOMS = 10;
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int quant = sc.nextInt();
		
		Rent[] vect = new Rent[ROOMS]; 
		
		for (int i = 1; i <= quant; i++) {
			System.out.println();
			System.out.println("RENT #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name, email);
		}
		
		System.out.println("\nBusy rooms:");
		
		for (int i = 0; i < ROOMS; i++) {
			if (vect[i] != null) {
				System.out.println(i 
								+ ": "
								+ vect[i].getName()
								+ ", "
								+ vect[i].getEmail());
			}
		}
		
		sc.close();
	}
}