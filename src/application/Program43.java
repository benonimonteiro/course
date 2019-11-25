package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

public class Program43 {

	public static void main(String[] args) {

		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Rectangle(Color.RED, 3.0, 2.0));
		shapes.add(new Circle(Color.BLUE, 2.0));
		
		List<Circle> circles = new ArrayList<>();
		circles.add(new Circle(Color.RED, 2.0));
		circles.add(new Circle(Color.BLUE, 3.0));
		
		System.out.println("Total area (Shapes): " + totalArea(shapes));
		System.out.println("Total area (Circles): " + totalArea(circles));

	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		
		for (Shape shape : list) {
			sum += shape.area();
		}
		
		return sum;
	}
}
