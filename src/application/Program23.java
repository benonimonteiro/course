package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program23 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int count = sc.nextInt();
		
		for (int i = 1; i <= count; i++) {
			System.out.printf("Tax payer #%d data:%n", i);
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if (resp == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, annualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();				
				
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		
		double totalTax = 0.0;
		
		for (TaxPayer taxPayer : list) {
			totalTax += taxPayer.calculateTax();
			
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.calculateTax()));
		}
		
		System.out.printf("%nTOTAL TAXES: $ %.2f", totalTax);
		
		sc.close();
	}
}
