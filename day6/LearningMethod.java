package day6;

public class LearningMethod
{
	public static void main(String[] args)
	{
		int sum1 = 0;
		
		for(int i=1 ; i<=5 ; i++)
		{
			sum1 = sum1+i;		// 1+2+3+4+5
		}
		
		System.out.println("The first sum = " + sum1);
		
		int sum2 = 0;
		
		for(int j=10 ; j<=15 ; j++)
		{
			sum2 = sum2+j;		// 10+11+12+13+14+15
		}
		
		System.out.println("The second sum = " + sum2);
		
		int sum3 = 0;
		
		for(int i=20 ; i<=30 ; i++)
		{
			sum3 = sum3+i;		// 20+21+22+23+24+25+26+27+28+29+30
		}
		
		System.out.println("The third sum = " + sum3);
	}
}
