package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SimpleEmployee;

public class Program03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		SimpleEmployee employee = new SimpleEmployee();
		
		employee.name = name;
		employee.grossSalary = grossSalary;
		employee.tax = tax;
				
		System.out.println("\nEmployee: " + employee);
		
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("\nUpdated data: " + employee);
		
		sc.close();
	}
}
