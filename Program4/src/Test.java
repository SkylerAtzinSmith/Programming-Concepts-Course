//////////////////////////////////////////////////////////////////////////////////////////////////////
//																									
//Name:					Skyler Smith
//Date: 				29-Aug-2020
//Course Name:			CPSC 50100 | Programming Fundamentals										
//Semester:				Summer II 2020																
//Assignment Name:		PROGRAMMING ASSIGNMENT 4													
//Program Name:			Test																	
//																									
//////////////////////////////////////////////////////////////////////////////////////////////////////	
//----------------------------------------------------------------------------------------------------
//This program takes a training set of 75 samples with 4 attributes and a classifier, and finds the 
//nearest neighbor in the training set to the test set, to classify the test set, then reports accuracy
//----------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////

//import the scanner
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		//Print out the author info:
		System.out.println("Programming Fundamentals\r\n" + 
				"NAME: Skyler Smith\r\n" + 
				"PROGRAMMING ASSIGNMENT 4 - SET\n");
		
		//Initialize Set, Scanner, and keeplooping variable
		Set Set = new Set();
		Scanner scan = new Scanner(System.in);
		boolean KeepLooping = true;
		
		//Create an infinite loop for commanding the linked list
		while (KeepLooping = true) {
		System.out.print("Enter command: ");
		String command = scan.nextLine()+"";
		
		//Set up a try-catch to ignore commands that are not formatted correctly
		try {
			
		//split the command into a method & a number
		String Array[] = command.split(" ");
		int number = Integer.parseInt(Array[1]);
		String method = Array[0];
		
		//depending on the command, run the corresponding method
		if(method.equals("exists")) {
			System.out.println(Set.exists(number));
		}
		if (method.equals("add")) {
			Set.add(number);
			System.out.println(Set.toString());
		}
		if (method.equals("del")) {
			Set.del(number);
			System.out.println(Set.toString());
		} 
		} 
		
		//set the exceptions for commands that are not formatted correctly
		catch (NumberFormatException e) {} 
		catch(ArrayIndexOutOfBoundsException e){}
		
		}
		//close the scanner to appease the IDE even though the loop runs infinitely
		scan.close();
	}

}
