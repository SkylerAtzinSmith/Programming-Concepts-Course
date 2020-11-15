//-----------------------------------------------------------------------
//Generates a random User-Name from users first and last name
//-----------------------------------------------------------------------

//imports the Scanner class and Random Class
import java.util.Scanner;
import java.util.Random;

public class UserNames {
	public static void main(String[] args) {
		
		//Creates new Scanner Object called scan
		Scanner scan = new Scanner(System.in);
		//creates new random object called rand
		Random rand = new Random ();
		
		//collects name from the user and generates random number
		System.out.print("Enter Your First Name: ");
		String FN = scan.nextLine();
		System.out.print("Enter Your Last Name: ");
		String LN = scan.nextLine();
		int NM = 10 + rand.nextInt(89);
				
		System.out.println("\nNew User Name:" + LN.substring(0, 4) + FN.substring(0, 1) + NM);
	}
}