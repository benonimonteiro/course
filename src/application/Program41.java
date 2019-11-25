package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program41 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("../products.txt"))) {
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				
				list.add(new Product(name, price));
				line = br.readLine();
			}
			
			Product product = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(product.priceTag());
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
