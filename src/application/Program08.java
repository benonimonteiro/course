package application;

import java.util.Locale;
import java.util.Scanner;

public class Program08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers? ");
		int quant = sc.nextInt();
		
		double[] vect = new double[quant];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter number: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];			
		}
		
		 double avg = sum / vect.length;
		
		System.out.printf("AVERAGE HEIGHT = %.2f", avg);
		
		sc.close();
	}
}
