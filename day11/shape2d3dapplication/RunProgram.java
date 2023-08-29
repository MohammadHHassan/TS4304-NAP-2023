package day11.shape2d3dapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Shape2D [] shapes2D = new Shape2D[5];	// Declaration of array to store 2D shapes (5 in total)
		
		shapes2D[0] = new Circle("Pink", 2.5);	// First: Circle object. Colour: Pink, Radius: 2.5
		shapes2D[1] = new Rectangle("Black", 5.2, 6);	// Second: Rectangle object. Colour: Black, Length: 5.2, Width: 6
		shapes2D[2] = new Square("White", 10);	// Third: Square object. Colour: White, Side: 10
		shapes2D[3] = new Circle("Blue", 8.5);
		shapes2D[4] = new Square("Red", 5.555);
		
		for(int i=0 ; i<shapes2D.length ; i++)
		{
			System.out.println("--- Shape [" + i + "] ---");
			System.out.println(shapes2D[i] + "\n");
		}
		
		int numberOfCircle=0, numberOfSquare=0, numberOfRectangle=0;
		
		for(int j=0 ; j<shapes2D.length ; j++)
		{
			if(shapes2D[j] instanceof Circle)		// If the element is a circle object
			{
				numberOfCircle++;					// Increment numberOfCircle by 1
			}
			
			if(shapes2D[j] instanceof Square)		// If the element is a square object
			{
				numberOfSquare++;					// Increment numberOfSquare by 1
			}
			
			if(shapes2D[j] instanceof Rectangle)	// If the element is a rectangle object
			{
				numberOfRectangle++;				// Increment numberOfRectangle by 1
			}
		}
		
		System.out.println("Number of circle: " + numberOfCircle);
		System.out.println("Number of square: " + numberOfSquare);
		System.out.println("Number of rectangle: " + numberOfRectangle);
	}
}
