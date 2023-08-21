package day9.shapeapplication;

import java.text.DecimalFormat;

public class RunProgram
{
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("#.##");	// Implement decimal format class in 2 d.p
		
		Circle circle1 = new Circle("Blue", 2.5);		// Created first circle object
		System.out.println("Shape 1: Circle");
		System.out.println("Colour: " + circle1.colour);
		System.out.println("Radius: " + circle1.radius);
		System.out.println("Area = " + df.format(circle1.getArea()));
		System.out.println("Perimeter = " + df.format(circle1.getPerimeter()));
		
		// Shape shape1 = new Shape("Purple");
	}
}
