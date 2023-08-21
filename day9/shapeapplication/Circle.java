package day9.shapeapplication;

public class Circle extends Shape		// Inherit Shape class
{
	double radius;		// Instance variable for Circle object
	
	public Circle(String colour, double radius)		// Constructor for circle
	{
		super(colour);
		this.radius = radius;	// Store the data from parameter variable into instance variable radius
	}
	
	public double getArea()
	{
		return Math.PI*Math.pow(radius, 2);		// Return the value of area of the circle
	}
	
	public double getPerimeter()
	{
		return 2.0*Math.PI*radius;		// Return the value of perimeter of the circle
	}
}
