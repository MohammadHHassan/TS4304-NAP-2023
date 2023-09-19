package day14.javainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearningFileInputStream
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		try(FileInputStream input = new FileInputStream("test.dat"))
		{
			int value;
			value = input.read();		// Reading the first data and store inside value
			
			while(value!=-1)			// While there is still data inside the file to be read
			{
				System.out.println(value);		// Displaying the value data
				value = input.read();	// Reading the next data and store inside value
			}
		}
	}
}
