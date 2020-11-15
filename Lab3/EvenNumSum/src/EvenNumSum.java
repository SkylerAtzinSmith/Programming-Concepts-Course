//////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------------------------------
//Reads an integer value and prints the sum of all even 
//integers between 2 and the input value.
//---------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////

//imports the Scanner class
import java.util.Scanner;

public class EvenNumSum {
	
	public static void main(String[] args) {
		
		
		//Creates New Scanner Object called scan
		Scanner scan = new Scanner(System.in);
		
		
		//Initializes Sum and Num. Num is user input
		long Sum = 0;
		System.out.print("Please Enter a Number Greater than 2: ");
		int Num = scan.nextInt();
		
		
		//Restricts the user from inputting a number < 2
		while (Num < 2) {
			System.out.print("Please Enter a Number Greater than 2: ");
			Num = scan.nextInt();
		}
		
		
		//Initializes count
		//loops count + 2 until count is <= Num, Also adds every new count to Sum
		for (long count = 0 ; count <= Num ; count = count + 2)
			Sum = Sum + count ;
					
		//Prints the sum of the even numbers between 2 and the input value
		System.out.println("Your Even Number Sum is: " +Sum);		
	}
}