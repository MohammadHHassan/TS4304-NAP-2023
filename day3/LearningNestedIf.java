package day3;

import java.util.Scanner;

public class LearningNestedIf
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int age = scanner.nextInt();
		
		if(age>0 && age<100)
		{
			System.out.println("Valid age.");
			
			if(age<12)
			{
				System.out.println("Children.");
			}
			else if(age>=12 && age<18)
			{
				System.out.println("Teenager.");
			}
			else if(age>=18 && age<60)
			{
				System.out.println("Adult.");
			}
			else
			{
				System.out.println("Senior.");
			}
		}
		else
		{
			System.out.println("Invalid age.");
		}
		
		scanner.close();
	}
}
