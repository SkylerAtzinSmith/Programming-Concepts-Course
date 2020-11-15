//-----------------------------------------------------------------------
//Asks the user to guess the randomly generated age
//-----------------------------------------------------------------------

//imports the Scanner class
import java.util.Scanner;
//imports Random class
import java.util.Random;

//collects user input for name and age and prints
public class AgeGuess {
	public static void main(String[] args) {
	
		//creates new scanner object called scan
		Scanner scan = new Scanner (System.in);
		//creates new random object called rand
		Random rand = new Random ();
		
		//creates variables name, ageGuess, and random variable age
		String name;
		int ageGuess;
		int age = rand.nextInt(100) + 1;
		
		//collects name and age guess
		System.out.print("Enter Name Here: ");
		name = scan.nextLine();
		System.out.print("Enter Age Guess: ");
		ageGuess = scan.nextInt();
		
		//prints user input and correct age
		System.out.println("\n_____________________\n");
		System.out.println("Name: " + name);
		System.out.println("You Guessed: " + ageGuess + " years old");
		System.out.println("Correct Age: " + age + " years old");
		
		if(age != ageGuess) {
			System.out.println("\nYou guessed wrong!");
			} else { System.out.println("\nYou guessed right!");
			
		}
	}
}
