package day2;

import java.util.Scanner;		// Import Scanner API/library

public class LearningScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);		// Declaration of Scanner class
		
		System.out.print("Please enter your first name: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Please enter your last name: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Your full name is " + firstName + " bin " + lastName);
		
		scanner.close();
	}
}
