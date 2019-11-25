package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program38 {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("../employees.txt"))) {
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");				
				String name = fields[0];
				double salary = Double.parseDouble(fields[1]);
				
				employees.add(new Employee(0, name, salary));
				
				line = br.readLine();
			}
			
			Collections.sort(employees);
			
			for (Employee employee : employees) {
				System.out.println(employee);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
