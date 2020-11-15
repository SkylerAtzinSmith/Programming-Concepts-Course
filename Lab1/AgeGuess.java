//-----------------------------------------------------------------------
//Collects name and age guess from the user, then prints user input
//-----------------------------------------------------------------------

//imports the scanner class
import java.util.Scanner;

//collects user input for name and age and prints
public class AgeGuess {
	public static void main(String[] args) {
		//creates scanner new object called scan
		Scanner scan = new Scanner (System.in);
		
		//creates variables name and ageGuess
		String name;
		int ageGuess;
		
		//collects name and age guess
		System.out.print("Input Name: ");
		name = scan.nextLine();
		System.out.print("Guess Age: ");
		ageGuess = scan.nextInt();
		
		//prints user input
		System.out.println("\n_____________________\n");
		System.out.println("Name: " + name);
		System.out.println("Age Guessed: " + ageGuess);
	}
}