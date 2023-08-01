package day4;

public class LearningNestedFor
{
	public static void main(String[] args)
	{
		for(int i=1 ; i<=5 ; i++)		// Row 
		{
			for(int j=1 ; j<=5 ; j++)	// Column
			{
				System.out.print(i*j + "\t");	// Print row*column and tab spacing
			}
			System.out.println();		// Create a new line
		}
	}
}
