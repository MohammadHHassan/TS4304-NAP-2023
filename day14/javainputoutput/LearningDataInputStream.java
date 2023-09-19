package day14.javainputoutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearningDataInputStream
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		try(DataInputStream input = new DataInputStream(new FileInputStream("data.dat")))
		{
			/*
			 * System.out.println(input.readUTF()); // Display the first data (String)
			 * System.out.println(input.readDouble()); // Display the second data (double)
			 * System.out.println(input.readBoolean()); // Display the third data (boolean)
			 * 
			 * System.out.println(input.readUTF()); // Display the fourth data (String)
			 * System.out.println(input.readDouble()); // Display the fifth data (double)
			 * System.out.println(input.readBoolean()); // Display the sixth data (boolean)
			 */			
			
			while(input.available() != 0)		// While there is still input inside the file
			{
				System.out.println(input.readUTF());
				System.out.println(input.readDouble());
				System.out.println(input.readBoolean());
			}
		}
	}
}
