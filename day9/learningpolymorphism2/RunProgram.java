package day9.learningpolymorphism2;

public class RunProgram
{
	public static void main(String[] args)
	{
		Calculator calculator1 = new Calculator();	// Creating calculator object
		
		System.out.println(calculator1.add(2, 3));
		System.out.println(calculator1.add(2.5, 3.7));
	}
}
