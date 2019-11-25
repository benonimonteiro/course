package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Student name: ");		
		String name = sc.nextLine();
		System.out.print("Grade 1 (0-30): ");
		double grade1 = sc.nextDouble();
		System.out.print("Grade 2 (0-35): ");
		double grade2 = sc.nextDouble();
		System.out.print("Grade 3 (0-35): ");
		double grade3 = sc.nextDouble();
		
		Student student = new Student();		
		student.name = name;
		student.grades[0] = grade1;
		student.grades[1] = grade2;
		student.grades[2] = grade3;
		
		System.out.println("\nFINAL GRADE = " + String.format("%.2f", student.getFinalGrade()));
		System.out.println(student.getResult());
		
		sc.close();
	}
}
