package day14.learningthreads;

public class Message implements Runnable
{
	String name;			// Instance variable name
	
	public Message(String name)
	{
		this.name = name;	// Storing the data from parameter variable to instance variable
	}

	@Override
	public void run()
	{
		for(int i=1 ; i<=10 ; i++)					// Loop 10 times
		{
			System.out.println(i + ". " + name);	// Print out your name
			
			try
			{
				Thread.sleep(1000);					// Delay by 1000 ms or 1 sec
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}		
		}
	}
	
}
