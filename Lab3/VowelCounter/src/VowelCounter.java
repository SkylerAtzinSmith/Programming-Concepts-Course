//////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------------------------------
//Reads a string from the user and then determines and
//prints how many of each vowels appear in the string and how many of each consonant.
//---------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////

//imports the Scanner class
import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		
		
		//Creates New Scanner Object called scan
		Scanner scan = new Scanner(System.in);
		
		
		//Collects User input for String & initializes count variables for vowels, consonants,
		//and the character index position
		System.out.println("Enter a String below:");
		String input = scan.nextLine();
		int vCount = 0;
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		int cCount = 0;
		int pCount = 0;
		int character = 0;
		
		
		//Calculates length of the string
		int length = input.length();
		
		//for every index from 0 to the end of the string determined by length
		//the character at each index is converted into an integer
		for (int i = 0 ; i < length ; i = i+1) {
			character = Integer.valueOf(input.charAt(i));
		
		//--------------------------------------------------------------------------------------------
		//The integer of each character is put through the if else statements until a condition is met
		//if none of the conditions are met, no counter is increased
		//--------------------------------------------------------------------------------------------
			
			//for every a or A vowels of a are counted
			if (character == 97 || character ==65 ) {
				aCount = aCount + 1;
			}else {
				
				//for every e or E vowels of e are counted
				if (character == 101 || character == 69) {
					eCount = eCount + 1;
				} else {
					
					//for every i or I vowels of i are counted
					if (character == 105 || character == 73) {
							iCount = iCount+1;
					} else {
						
						//for every o or O vowels of O are counted
						if (character == 111 || character == 79) {
							oCount = oCount + 1;
						} else {
							
							//for every u or U, vowels of u are counted
							if (character == 117 || character == 85) {
								uCount = uCount + 1;
							} else { 
								
								//for every unicode letter between 65 & 122 that is not a vowel
								//a consonant is counted
								if (character <= 122 & character >= 65) {
									cCount = cCount + 1;
								} else {
									pCount = pCount + 1;
								}
							}
						}
					}
				}
			}
		}
		
		//counts the total number of vowels
		vCount = aCount + eCount + iCount + oCount + uCount;
		
		//Prints the results
		System.out.println("\nHere are your Results:\n");
		System.out.println("Your string had " + aCount + " a");
		System.out.println("Your string had " + eCount + " e");
		System.out.println("Your string had " + iCount + " i");
		System.out.println("Your string had " + oCount + " o");
		System.out.println("Your string had " + uCount + " u");
		System.out.println("Your string had " + cCount + " consonants");
		System.out.println("Your string had " + vCount + " total vowels and "+ (pCount+cCount) + " other characters");
	}

}
