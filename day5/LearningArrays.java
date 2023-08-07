package day5;		// Name of the package

public class LearningArrays		// Name of the class
{
	public static void main(String[] args)	// Main method
	{
		// Array is a set/collection of elements with the same data type
		int [] number = new int[3];		// Declaration of number array. Data type is integer. Array size = 3
		number[0] = 10;		// First element of the array
		number[1] = 15;		// Second element
		number[2] = 20;		// Third and last element
		
		for(int j=0 ; j<3 ; j++)
		{
			System.out.print(number[j] + "\t");
		}
		System.out.println();
		
		System.out.println(number[0] + "\t" + number[1] + "\t" + number[2]);
		
		for(int i=0 ; i<number.length ; i++)
		{
			System.out.print(number[i] + "\t");
		}
		System.out.println();
		
		for(int k : number)
		{
			System.out.print(k + "\t");
		}
		System.out.println();
		
		String [] names = new String[5];
		names[0] = "Haji";
		names[1] = "Mohammad";
		names[2] = "Bin";
		names[3] = "Haji";
		names[4] = "Hassan";
		
		for(String a : names)
		{
			System.out.print(a + " ");
		}
	}
}
