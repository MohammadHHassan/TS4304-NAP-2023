package day11.shape2d3dapplication;

public class Square extends Shape implements Shape2D
{
	double side;

	public Square(String colour, double side)
	{
		super(colour);
		this.side = side;
	}

	@Override
	public double getArea()
	{
		return side*side;
	}

	@Override
	public double getPerimeter()
	{
		return 4.0*side;
	}

	@Override
	public String toString() {
		return "Square [ Side = " + df.format(side) + ", Colour = " + colour + ", Area = " + df.format(getArea()) + ", Perimeter = "
				+ df.format(getPerimeter()) + " ]";
	}
	
}
