package day14.javainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningFileOutputStream
{
	public static void main(String[] args) throws IOException
	{
		try(FileOutputStream output = new FileOutputStream("test.dat"))		// Creating file called test.dat
		{
			for(int i=50 ; i<=100 ; i++)
			{
				output.write(i);		// Writing data inside the file
			}
		}
	}
}
