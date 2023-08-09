package day6;

import java.util.Scanner;

public class ExampleFindHighestNumber
{
	static int firstNumber, secondNumber;		// Class variables. Can be recognized by the whole class
	static Scanner scanner = new Scanner(System.in);	// Declaration of Scanner for the whole class
	
	public static void main(String[] args)
	{
		askInput();
		findAndPrintHighestNumber();
	}
	
	public static void askInput()
	{
		System.out.print("Please enter the first number: ");		// Prompt a message for the user to enter the first number
		firstNumber = scanner.nextInt();		// Store the input in firstNumber class variable
		
		System.out.print("Please enter the second number: ");		// Prompt a message for the user to enter the second number
		secondNumber = scanner.nextInt();		// Store the input in secondNumber class variable
	}
	
	public static void findAndPrintHighestNumber()
	{
		String text = "The highest number between the two is ";
		
		if(firstNumber>secondNumber)		// If firstNumber is higher than secondNumber
		{
			System.out.println(text + firstNumber);
		}
		else								// If secondNumber is higher than or equal to firstNumber
		{
			System.out.println(text + secondNumber);
		}
	}
}
