//////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------------------------------
//Asks the user to guess a randomly generated age, gives feedback, and counts number of guesses.
//---------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////

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
		int counter = 1;
		
		//creates variables name, ageGuess, and random variable age
		String name;
		int ageGuess;
		int age = rand.nextInt(100);
		
		//collects name and age guess
		System.out.print("Enter Name Here: ");
		name = scan.nextLine();
		System.out.print("Enter Age Guess: ");
		ageGuess = scan.nextInt();
		
		//Evaluates initial guess, Gives user feedback
		if(age == ageGuess) {
			System.out.println("\nYou Are Correct!!");
			System.out.println("_____________________\n");
			System.out.println("Name: " + name);
			System.out.println("You Guessed: " + ageGuess + " years old");
			System.out.println("Correct Age: " + age + " years old");
			System.out.println("\nIt only took you " + counter + " Guess!");
		} else { 
			if(age > ageGuess) {
				System.out.println("older");
			} else {
				System.out.println("younger"); }
		
		//Loops feedback until the user guesses correctly, counts the number of guesses
		while (ageGuess != age) {
			System.out.print("Enter Age Guess: ");
			ageGuess = scan.nextInt();
			
			counter = ++counter;
			
			if(age == ageGuess) {
				System.out.println("\nYou Are Correct!!");
			} else { 
				if(age > ageGuess) {
					System.out.println("older");
				} else {
				System.out.println("younger");
					}
				}
			}
		//prints user input and correct age
		System.out.println("_____________________\n");
		System.out.println("Name: " + name);
		System.out.println("You Guessed: " + ageGuess + " years old");
		System.out.println("Correct Age: " + age + " years old");
		System.out.println("\nIt took you: " + counter + " Guesses");
		}
	}
}