package day9.shapeapplication;

public class Square extends Shape
{
	double side;
	
	public Square(String colour, double side)
	{
		super(colour);
		this.side = side;
	}
	
	public double getArea()
	{
		return side*side;
	}
	
	public double getPerimeter()
	{
		return 4.0*side;
	}
}
