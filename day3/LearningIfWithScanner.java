package day3;

import java.util.Scanner;

public class LearningIfWithScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);	// Implement a Scanner class to accept user's input
		
		System.out.print("Please enter a value between 5 an 10: ");
		int input = scanner.nextInt();
		
		if(input>=5 && input<=10)		// The condition if input is in between 5 an 10 (inclusive)
		{
			System.out.println("The value is within the range.");
		}
		else
		{
			System.out.println("The value is NOT in range.");
		}
		
		scanner.close();
	}
}
