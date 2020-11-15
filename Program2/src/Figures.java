//////////////////////////////////////////////////////////////////////////////////////////////////////
//																									
//Name:					Skyler Smith
//Date: 				01-Aug-2020
//Course Name:			CPSC 50100 | Programming Fundamentals										
//Semester:				Summer II 2020																
//Assignment Name:		PROGRAMMING ASSIGNMENT 2													
//Program Name:			Figures																	
//																									
//////////////////////////////////////////////////////////////////////////////////////////////////////	
//----------------------------------------------------------------------------------------------------
// This program generates figures made of X depending on the user-generated size value and selection					
//----------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////

//imports java Scanner Utility and Arrays Utility. 
//Java Arrays utility is needed to print 2D Arrays
import java.util.Arrays;
import java.util.Scanner;

public class Figures {
	
		//-------------------------------------------------------
		//creates a new method for the Figures class called printBox
		//-------------------------------------------------------
		void printBox(int size) {
			
				//Creates a square box made of X with dimensions: size x size			
				for (int j = 1 ; j <= size ; j = j + 1) {
					System.out.println("");
				
					for (int i = 1 ; i <= size ; i = i + 1) {
						System.out.print("X");
					}
				}
				//prints the nextline after box to match exact output
				System.out.println("");
		}
		//-------------------------------------------------------
		//creates a new method for the Figures class called printDiamond
		//-------------------------------------------------------
		void printDiamond(int size) {
			
			//Constructs the necessary Diamond 2D Array and axis array components for scaling up and down the 2D array 
			int [][] dArray = new int [size][size+1];
			int [] scaleRowX1a = new int [(size/2)+1];
			int [] scaleRowX1b = new int [size/2];
			int [] scaleRowX2a = new int [(size/2)+1];
			int [] scaleRowX2b = new int [size/2];

			//fills in values for column and row scaling arrays based on the figure size
			for (int i = 0 ; i < (size/2)+1 ; i++) {
				scaleRowX1a[i] = (size/2)-i;
			}
			for (int i = 0 ; i < (size/2) ; i++) {
				scaleRowX1b[i] = i+1;
			}
			for (int i = 0 ; i < (size/2)+1  ; i++) {
				scaleRowX2a[(size/2)-i] = (size-i);
			}
			for (int i = 0 ; i < (size/2) ; i++) {
				scaleRowX2b[i] = size-(i+1);
			}
			
			//Prints the top half of the Diamond Shape
			for (int i = 0 ; i < scaleRowX1a.length; i++) {
				dArray[i][ scaleRowX1a[i] ] = 1;
				dArray[i][ scaleRowX2a[i] ] = 1;
			}
			
			//prints the lower half of the diamond shape
			for (int i = 0 ; i < (size/2) ; i++) {
				dArray[ scaleRowX2a[i] ][ scaleRowX1b[i] ] = 1;
				dArray[ scaleRowX2a[i] ][ scaleRowX2b[i] ] = 1;
			}
					
			//Print 2D array to suitable output format
			//Replace all 1 with X and all 0 with space
			System.out.println("\n"+Arrays.deepToString(dArray)
					.replace("], ", "\n")//remove all end row brackets and new line
					.replace("[", "")//remove all beginning of row brackets
					.replace(", ",  "")//remove , between index values
					.replace("0", " ")//replace all 0 with space
					.replace("1", "X")//replace all 1 with X
					.replace("]]", ""));//remove end of array brackets, end print				
		}	
		//-------------------------------------------------------
		//creates a new method for the Figures class called printX
		//-------------------------------------------------------
		void printX(int size) {
			
			//Constructs the necessary Diamond 2D Array and axis array components for scaling up and down the 2D array 
			int [][] XArray = new int [size][size];
			int [] scaleArm1= new int [size];
			int [] scaleArm2 = new int [size];
	
			//fills in values for column and row scaling along array axis based on the figure size
			for (int i = 0 ; i < size ; i++) {
				scaleArm1[i] = i;
			}
			for (int i = 0 ; i < size ; i++) {
				scaleArm2[i] = ((size-1)-i);
			}
			
			//Prints the 2 arms of the X shape
			for (int i = 0 ; i < scaleArm1.length; i++) {
				XArray[i][ scaleArm1[i] ] = 1;
				XArray[i][ scaleArm2[i] ] = 1;
			}
	
			//Print 2D array to suitable output format
			//Replace all 1 with X and all 0 with space
			System.out.println("\n"+Arrays.deepToString(XArray)
					.replace("], ", "\n")//remove all end row brackets and new line
					.replace("[", "")//remove all beginning of row brackets
					.replace(", ",  "")//remove , between index values
					.replace("0", " ")//replace all 0 with space
					.replace("1", "X")//replace all 1 with X
					.replace("]]", ""));//remove end of array brackets, end print				
		}	
		
	public static void main(String[] args) {
				
			//Prints the Program & Author Info
			System.out.println("Programming Fundamentals\n" + 
								"NAME: Skyler Smith\n" + 
								"PROGRAMMING ASSIGNMENT 2\n");
		
			//Makes a new scanner object called scan
			Scanner scan = new Scanner(System.in);
				
			//Makes a new Box object called bx
			Figures figure = new Figures();
				
			//User defined variable size
			System.out.print("Enter the Size of the figure (odd number): ");
			int size = scan.nextInt();
				
			//if user inputs number < 1, printbox throws an error
			while ((size % 2 ) < 1) {
				System.out.println("Invalid figure size - must be an odd number\n");
				System.out.print("Renter the size of the figure: ");
				size = scan.nextInt();
			}
		
		//Loops the program to keep taking inputs until input 4 is selected to close program
		while (size >0 ) {
			
			//Asks the user to select from the menu of figures
			System.out.println( "\nMENU:\n"+
								"1. Print box\n" +
								"2. Print diamond\n" +
								"3. Print X\n" +
								"4. Quit program\n");
			
			//User defined Menu Option
			System.out.print("Please select an option: ");
			int Sel = scan.nextInt();
			
			//if user inputs number <1 or >4, prompt sustains
			while (Sel < 1 || Sel >4) {
				System.out.print("Please select an option: ");
				Sel = scan.nextInt();
				scan.close();
			}
			
			//prints a figure of size dimensions based on User selection
			//closes program if user enters option 4
			switch(Sel) {
				case 1: figure.printBox(size);
					break;
				case 2: figure.printDiamond(size);
					break;
				case 3: figure.printX(size);
					break;
				case 4: System.out.println("\nGood bye!");
					System.exit(0);
					break;
			}
		}
	}
}
