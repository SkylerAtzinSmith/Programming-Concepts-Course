import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------------------------------
//Creates a new Class called Box, with a new method called printbox
//printbox is used to print boxes made of * with size x size dimension
//---------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////

public class Box {

	//-------------------------------------------------------
	//creates a new method for the Box class called printbox
	//-------------------------------------------------------
	void printbox(int size) {
		
		//if user inputs number < 1, printbox throws an error
		if (size < 1) {
			System.out.println("The Box does Not Exist!");
		} else {
			
			//Creates a square box made of * with dimensions: size x size
			//for every size input, printbox prints that many * on 1 line
			//for every finished interation of i, printbox moves down 1 line until lines of * = size
			
			for (int j = 1 ; j <= size ; j = j + 1) {
				System.out.println("");
				for (int i = 1 ; i <= size ; i = i + 1) 
					System.out.print("* ");
			}
			
		}
	}
	
	//-------------------------------------------------------
	//Prints a box of user-defined size
	//-------------------------------------------------------
	public static void main(String[] args) {
		
		//Makes a new scanner object called scan
		Scanner scan = new Scanner(System.in);
		
		//Makes a new Box object called bx
		Box bx = new Box();
		
		//User defined variable size
		System.out.print("Enter the Size of your Box: ");
		int size = scan.nextInt();
		
		//prints a box made of * of dimension size x size. If 5 is entered, creates a 5x5 box.
		bx.printbox(size);
	}
}
