package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program39 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Amount: ");
			double amount = sc.nextDouble();
			System.out.print("Months: ");
			int months = sc.nextInt();
			
			InterestService interestService = new BrazilInterestService(2.0);
			double payment = interestService.payment(amount, months);
			
			System.out.printf("%nPayment after %d months:%n", months);
			System.out.println(String.format("%.2f", payment));
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

}
