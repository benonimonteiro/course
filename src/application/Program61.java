package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

import entities.People;

public class Program61 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter full file path: ");
			String path = sc.nextLine();
			System.out.print("Enter salary: ");
			double salarySearch = sc.nextDouble();			
			
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				List<People> list = new ArrayList<>();
				
				String line = br.readLine();
						
				while (line != null) {
					String[] fields = line.split(",");
					String name = fields[0];
					String email = fields[1];
					double salary = Double.parseDouble(fields[2]);
					
					list.add(new People(name, email, salary));
					
					line = br.readLine();
				}
				
				double sum = list.stream()
						.filter(p -> p.getName().charAt(0) == 'M')
						.map(p -> p.getSalary())
						.reduce(0.0, (x, y) -> x + y);
				
				System.out.printf("Email of people whose salary is more than %.2f:%n", salarySearch);
				list.removeIf(p -> p.getSalary() <= salarySearch);
				//list.forEach(p -> System.out.println(p.getEmail()));
				Stream<String> emails = list.stream()
						.filter(p -> p.getSalary() > salarySearch)
						.map(p -> p.getEmail())
						.sorted();
				emails.forEach(System.out::println);				
				
				System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sum);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
