package day6;

public class LearningMethods3
{
	public static void main(String[] args)
	{
		System.out.println(printName("Haji Mohammad"));
		displayName("Haji Hassan");
	}
	
	public static String printName(String name)
	{
		String text = "My name is " + name;
		return text;
	}
	
	public static void displayName(String name)
	{
		System.out.println("My name is " + name);
	}
}
