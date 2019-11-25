package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		method1();
		System.out.println("End of program");

	}
	
	public static void method1() {
		System.out.println("*** METHOD1 START ***");
		method2();
		System.out.println("*** METHOD1 END ***");
	}

	public static void method2() {
		System.out.println("*** METHOD2 START ***");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("List of words separated by blanks:");
			String[] vect = sc.nextLine().split(" ");
			System.out.print("Enter a word position: ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}

		sc.close();
		System.out.println("*** METHOD2 END ***");
	}
}
