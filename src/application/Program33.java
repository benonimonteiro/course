package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a .csv products file: ");
		String inputFile = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {			
			List<Product> list = new ArrayList<>();
			
			String lines = br.readLine();
			
			while (lines != null) {
				String[] fields = lines.split(",");
				
				String p_name = fields[0];
				double p_price = Double.parseDouble(fields[1]);
				int p_quant = Integer.parseInt(fields[2]);
				
				list.add(new Product(p_name, p_price, p_quant));
				
				lines = br.readLine();
			}
			
			String outputPath = new File(inputFile).getParent() + "\\out";
			boolean success = new File(outputPath).mkdir();
			
			if (success) {
				String outputFile = outputPath + "\\summary.csv";
				
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {			
					for (Product prod : list) {
						String p_name = prod.getName();
						double p_total = prod.totalValueInStock();
						bw.write(p_name + ", " + p_total);
						bw.newLine();
					}				
				}
				catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				}						
		
				System.out.println("Output file: " + outputFile);
			}
			else {
				System.out.println("Could not create output directory");
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}