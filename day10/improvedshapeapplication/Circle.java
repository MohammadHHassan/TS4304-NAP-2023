package day10.improvedshapeapplication;

public class Circle extends Shape
{
	double radius;
	
	public Circle(String colour, double radius) 
	{
		super(colour);
		this.radius = radius;
	}

	@Override
	public double getArea() 
	{
		return Math.PI*Math.pow(radius,2);
	}

	@Override
	public double getPerimeter() 
	{
		return 2.0*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Circle [ Radius = " + radius + ", Colour = " + colour + ", Area = " + df.format(getArea()) + ", Perimeter = "
				+ df.format(getPerimeter()) + " ]";
	}
	
}
