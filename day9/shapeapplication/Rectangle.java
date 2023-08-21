package day9.shapeapplication;

public class Rectangle extends Shape
{
	double length, width;
	
	public Rectangle(String colour, double length, double width)
	{
		super(colour);
		this.length = length;
		this.width = width;
	}
	
	public double getArea()
	{
		return length*width;
	}
	
	public double getPerimeter()
	{
		return (2*length)+(2*width);
	}
}
