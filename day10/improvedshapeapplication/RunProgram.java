package day10.improvedshapeapplication;

import java.util.Scanner;

public class RunProgram
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Creating Triangle 1...");
		System.out.print("Please enter the colour: ");
		String colour1 = scanner.nextLine();
		System.out.print("Please enter the base value: ");
		double base1 = scanner.nextDouble();
		System.out.print("Please enter the height value: ");
		double height1 = scanner.nextDouble();
		scanner.nextLine();
		
		Triangle triangle1 = new Triangle(colour1, base1, height1);
		
		System.out.println(triangle1);
		
		System.out.println("\nChanging Triangle 1's colour to: ");
		String colour2 = scanner.nextLine();
		
		triangle1.editColour(colour2);
		System.out.println(triangle1);
	}
}
