package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program37 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("../names.txt"))) {
			
			String line = br.readLine();
			
			while (line != null) {
				names.add(line);
				line = br.readLine();
			}
			
			Collections.sort(names);
			
			for (String name : names) {
				System.out.println(name);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
