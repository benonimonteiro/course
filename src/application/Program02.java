package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(width);
		rectangle.setHeight(height);
		
		System.out.println("Area: " + String.format("%.2f", rectangle.area()));
		System.out.println("Perimeter: " + String.format("%.2f", rectangle.perimeter()));
		System.out.println("Diagonal: " + String.format("%.2f",rectangle.diagonal()));
		
		sc.close();
	}
}
