package application;

import java.util.Scanner;

import services.PrintService;

public class Program40 {

	public static void main(String[] args) {

		PrintService<Integer> ps = new PrintService<>();
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("How many values? ");
			int count = sc.nextInt();
						
			for (int i = 0; i < count; i++) {
				System.out.print("Enter number: ");
				ps.addValue(sc.nextInt());
			}
			
			ps.print();
			Integer num = ps.first();
			System.out.println("\nFirst: " + num);
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
}
