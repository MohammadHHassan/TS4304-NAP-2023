package day2;

import java.util.Scanner;		// Scanner library import

public class LearningScanner2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);		// Declare Scanner class
		
		System.out.print("Please enter an integer value: ");	// Prompt a message for the user to enter integer value
		try
		{
			int a = scanner.nextInt();
			System.out.println("The integer value entered is " + a);	// Display value a			
		} 
		catch (Exception e) 
		{
			System.out.println("Wrong input.");
			scanner.nextLine();
		}
		
		System.out.print("Please enter a decimal value: ");
		double b = scanner.nextDouble();
		System.out.println("Decimal value entered is " + b);
		
		scanner.close();
	}
}
