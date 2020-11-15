//-----------------------------------------------------------------------
//Reports numeric input (0-9) as text
//-----------------------------------------------------------------------

//imports the Scanner class
import java.util.Scanner;

public class NumDisplay {
	public static void main(String[] args) {
		
		//Creates new Scanner Object called scan
		Scanner scan = new Scanner(System.in);
		
		//Collects numeric input (0-9) from the user and defines Number String
		System.out.print("Enter a number between 0 and 9: ");
		int Num = scan.nextInt();
		String Number;
		
		//Defines the Switch values for the Number and default 
		switch(Num) {
			case 0: Number = "Zero";
			break;
			case 1: Number = "One";
			break;
			case 2: Number = "Two";
			break;
			case 3: Number = "Three";
			break;
			case 4: Number = "Four";
			break;
			case 5: Number = "Five";
			break;
			case 6: Number = "Six";
			break;
			case 7: Number = "Seven";
			break;
			case 8: Number = "Eight";
			break;
			case 9: Number = "Nine";
			break;
			default: Number = "You did NOT enter a number between 0 and 9";
			break;
		}
		
		//prints the numer in word-form
		System.out.println(Number);
	
	}
}
