package day3;

public class LearningString
{
	public static void main(String[] args)
	{
		String a = "ABC123";
		System.out.println("a = " + a);
		
		String b = "abc123";
		System.out.println("b = " + b);
		
		boolean c = a.equals(b);
		System.out.println("c = " + c);
		
		boolean d = a.equalsIgnoreCase(b);
		System.out.println("d = " + d);
		
		String e = "Telecommunications";
		String f = "Tele";
		
		int g = e.indexOf(f);
		System.out.println("g = " + g);		// -1 means not included
		
		if(g==-1)
		{
			System.out.println(f + " is not included in " + e);
		}
		else
		{
			System.out.println(f + " is included in " + e);
		}
	}
}
