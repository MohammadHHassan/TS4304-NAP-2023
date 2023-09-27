package day17.additionquizmulticlient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Date;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket socketServer = new ServerSocket(9101);		// Declaration of server socket with port number 9101
			System.out.println("Server started at " + new Date());	// Display the time and date when the server is started
			
			DecimalFormat df = new DecimalFormat("#.##");		// Declare decimal format in 2 d.p
			
			while(true)		// Forever loop to accept multiple clients
			{
				Socket socket = socketServer.accept();		// Accepting socket request from client
				
				new Thread(new Runnable() 		// Implement thread to serve multiple clients simultaneously
				{
					@Override
					public void run()
					{
						try
						{
							DataInputStream fromClient = new DataInputStream(socket.getInputStream());	// Enable reading data from client
							DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());	// Enable writing data to client
							
							String name = fromClient.readUTF();		// Receive the name from client and store inside variable name
							System.out.println("\n" + name + " has been connected.");	// Display the name which is connected
							
							int questionNumber=0;
							
							while(true)		// Forever loop to send and receive data to and from the specific client
							{
								questionNumber++;		// Increment question number in sequence
								
								int randomNumber1 = 10 + (int)(Math.random()*((99-10)+1));	// Generate random number from 10-99
								toClient.writeInt(randomNumber1);	// Send the first random number generated to client
								
								int randomNumber2 = 10 + (int)(Math.random()*((99-10)+1));	// Generate random number from 10-99
								toClient.writeInt(randomNumber2);	// Send the second random number generated to client
								
								int answer = fromClient.readInt();	// Receive the user's answer
								
								String question = "\n" + name + "'s Q" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?";
								
								if(answer==(randomNumber1+randomNumber2))		// If the user answered correctly
								{
									System.out.println(question + " Answered " + answer + " [CORRECT]");
								}
								else											// If the user answered incorrectly
								{
									System.out.println(question + " Answered " + answer + " [INCORRECT]");
								}
								
								double totalMarks = fromClient.readDouble();	// Receive total marks from client
								System.out.println(name + " current marks = " + df.format(totalMarks) + "%");
							}
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
