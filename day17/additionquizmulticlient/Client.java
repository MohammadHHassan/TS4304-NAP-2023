package day17.additionquizmulticlient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 9101);		// Requesting socket with port number 9101 to the server
			
			DecimalFormat df = new DecimalFormat("#.##");		// Declare decimal format in 2 d.p
			
			Scanner scanner = new Scanner(System.in);			// Enable user's input 
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());	// Enable reading data from server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());	// Enable writing data to server
			
			System.out.print("Please enter your name: ");		// Prompt a message for the user to enter their name
			String name = scanner.nextLine();					// Store the user's name in variable name
			toServer.writeUTF(name);		// Sending the user's name to the server
			
			int questionNumber=0, marks=0;	// Declare question number to count the question and marks to count the correct answer
			double totalMarks;		// Declare total marks to calculate the percentage of correct answers
			
			while(true)		// Forever loop to send and receive data to and from the server
			{
				questionNumber++;	// Increment question number in sequence
				
				int randomNumber1 = fromServer.readInt();	// Receive the first random number generated from the server
				int randomNumber2 = fromServer.readInt();	// Receive the second random number generated from the server
				
				System.out.println("\nQ" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?");	// Prompt the question to the user
				int answer = scanner.nextInt();		// Store user's answer
				toServer.writeInt(answer);		// Send user's answer to server
				
				if(answer==(randomNumber1+randomNumber2))	// If the user answered correctly
				{
					marks++;		// Increment marks to count the correct answer
					totalMarks = ((double)(marks)/questionNumber)*100;	// Calculate the total marks in percentage
					
					System.out.println("Correct! :) - Current marks = " + df.format(totalMarks) + "%");
				}
				else										// If the user answered incorrectly
				{
					totalMarks = ((double)(marks)/questionNumber)*100;	// Calculate the total marks in percentage
					
					System.out.println("Incorrect! :( - Current marks = " + df.format(totalMarks) + "%");
				}
				
				toServer.writeDouble(totalMarks);		// Send the total marks to server
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}	
	}
}
