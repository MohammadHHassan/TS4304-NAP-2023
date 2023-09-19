package day14.learningthreads;

public class RunProgram
{
	public static void main(String[] args)
	{
		Message msg1 = new Message("Mohammad");		// Creating msg1 object
		Message msg2 = new Message("Haji");			// Creating msg2 object
		Message msg3 = new Message("Hassan");		// Creating msg3 object
		
		new Thread(msg1).start();			// Start the thread for msg1
		new Thread(msg2).start();			// Start the thread for msg2
		new Thread(msg3).start();			// Start the thread for msg3
	}
}
