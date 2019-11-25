package entities;

import enums.Color;

public class Rectangle extends AbstractShape {
	private Double width;
	private Double height;
		
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (2 * width) + (2 * height);
	}
	
	public double diagonal() {
		 double hypotenusa = (width * width) + (height * height);
		 hypotenusa = Math.sqrt(hypotenusa);
		 
		 return hypotenusa;
	}
}
