package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program47 {

	public static void main(String[] args) {

		Set<Integer> students = new HashSet<>();
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("How many students for course A? ");
			int count = sc.nextInt();
			
			for (int i = 1; i <= count; i++) {
				System.out.printf("Code for student #%d: ", i);
				students.add(sc.nextInt());
			}
			
			System.out.print("How many students for course B? ");
			count = sc.nextInt();
			
			for (int i = 1; i <= count; i++) {
				System.out.printf("Code for student #%d: ", i);
				students.add(sc.nextInt());
			}
			
			System.out.print("How many students for course C? ");
			count = sc.nextInt();
			
			for (int i = 1; i <= count; i++) {
				System.out.printf("Code for student #%d: ", i);
				students.add(sc.nextInt());
			}
			
			System.out.println("Total students: " + students.size());
		}
	}
}
