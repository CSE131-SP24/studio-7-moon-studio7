package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	private double width;

	public Rectangle(double w, double l) {
		length = l;
		width = w;
	}

	public double area() {
		double area = length * width;
		return area;
	}
	public double perimeter() {
		double perimeter = 2 * (length + width);
		return perimeter;
	}
	
	
	public static void main(String[] args) {
		Rectangle fafaefae = new Rectangle(3,7);
		System.out.println(fafaefae.area());
		System.out.println(fafaefae.perimeter());	
	}
	

}
