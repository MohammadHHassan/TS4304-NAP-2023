package day9.learningpolymorphism1;

public class RunProgram
{
	public static void main(String[] args)
	{
		Animals animal1 = new Animals();	// Creating an animal object
		animal1.makeSound();
		
		animal1 = new Cats();	// Changing the animal object into a cat object
		animal1.makeSound();
		
		Dogs dog1 = new Dogs();
		dog1.makeSound();
	}
}
