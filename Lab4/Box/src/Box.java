//////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------------------------------
//Creates a new Class called Box, with a new overloaded method called printbox
//---------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////

public class Box {
	
	//initialize size variable
	int size = 0;
			
	//new method called printbox
	void printbox() {
		
			//Creates a square box made of * with dimensions: size x size
			//for every size input, printbox prints that many * on 1 line
			//for every finished interation of i, printbox moves down 1 line until lines of * = size
			
			for (int j = 1 ; j <= size ; j++) {
				System.out.println("");
				for (int i = 1 ; i <= size ; i++) 
					System.out.print("*");
			}
	}
	
	//overloaded method for printbox that takes char input, and outputs box of size x size made of the character 'c'
	void printbox(char c) {
		
		for (int j = 1 ; j <= size ; j++) {
			System.out.println("");
			for (int i = 1 ; i <= size ; i++) 
				System.out.print('c');
		}
	}
	
	//-------------------------------------------------------
	//Prints a box of size 5, made of c
	//-------------------------------------------------------
	public static void main(String[] args) {

		//Makes a new Box object called bx
		Box bx = new Box();
		
		//set size to 5
		bx.size = 5;
		
		//initialize char c for the main method
		char c = 0;
		
		//prints a box made of c of dimension 5 x 5. prints box made of c no matter what the character is, as long as it is a character input
		bx.printbox(c);

	}
}
