package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.HourlyEmployee;
import entities.OutsourcedEmployee;

public class Program20 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<HourlyEmployee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int count = sc.nextInt();
		
		for (int i = 1; i <= count; i++ ) {
			System.out.printf("Employee #%d data:%n" , i);
			System.out.print("Outsourced (y/n)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (resp == 'y') {
				System.out.print("Aditional charge: ");
				double additionalCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));				
			}
			else {
				list.add(new HourlyEmployee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("\nPAYMENTS:");
		
		for (HourlyEmployee employee : list) {		
			System.out.println(employee);
		}
				
		sc.close();
	}
}
