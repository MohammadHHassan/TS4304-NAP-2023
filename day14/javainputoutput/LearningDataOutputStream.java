package day14.javainputoutput;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningDataOutputStream
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("data.dat")))
		{
			output.writeUTF("Upin");		// Writing String Upin to the file
			output.writeDouble(2.5);		// Writing double 2.5 to the file
			output.writeBoolean(true);		// Writing boolean true to the file
			
			output.writeUTF("Ipin");		// Writing String Ipin to the file
			output.writeDouble(7.3);		// Writing double 7.3 to the file
			output.writeBoolean(false);		// Writing boolean false to the file
		}
	}
}
