package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program60 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter full file path: ");
			String path = sc.nextLine();
			
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				List<Product> list = new ArrayList<>();
				
				String line = br.readLine();
				
				while (line != null) {
					String[] fields = line.split(",");
					String name = fields[0];
					double price = Double.parseDouble(fields[1]);
										
					list.add(new Product(name, price));
					
					line = br.readLine();
				}
				
				double avg = list.stream()
						.map(p -> p.getPrice())
						.reduce(0.0, (x, y) -> x + y) / list.size();
				
				System.out.printf("Average price: %.2f%n", avg);
								
				Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
						
				List<String> names = list.stream()
						.filter(p -> p.getPrice() < avg)
						.map(p -> p.getName())
						.sorted(comp.reversed())
						.collect(Collectors.toList());
				names.forEach(System.out::println);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
