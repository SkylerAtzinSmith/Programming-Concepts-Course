//////////////////////////////////////////////////////////////////////////////////////////////////////
//																									
//Name:					Skyler Smith																
//Course Name:			CPSC 50100 | Programming Fundamentals										
//Semester:				Summer II 2020																
//Assignment Name:		Programming Assignment #1													
//Program Name:			Cipher																		
//																									
//////////////////////////////////////////////////////////////////////////////////////////////////////	
//----------------------------------------------------------------------------------------------------
// This program ciphers a user-generated integer sum using a randomly generated key					
//----------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////


//imports the Scanner class
import java.util.Scanner;
//imports Random class
import java.util.Random;


public class Chipher {
		public static void main(String[] args) {
			
			//creates new scanner object called scan
			Scanner scan = new Scanner (System.in);
			//creates new random object called rand
			Random rand = new Random ();		

			//Ouptut Program Details:
			System.out.println("Programming Fundamentals");
			System.out.println("NAME: Skyler Smith");
			System.out.println("PROGRAMMING ASSIGNMENT 1\n");
			
			//Message and instructions for user:
			System.out.println("Welcome to the Cipher program.");
			System.out.println("Please enter 5 numbers between 0 and 19");
			
			
			//creates inputs for 5 numbers between 0 & 19
			//--------------------------------------------------------------------------------------
			//Nested if statements block user from entering more information after first			
			//offending input value.	0 > input > 19 is illegal									
			//--------------------------------------------------------------------------------------
			String Err01 = "Please read directions and try again!";
			System.out.print("1st Number: ");
			int n1 = scan.nextInt();
			if(n1 > 19 || n1 < 0) {
				System.out.print(Err01); 
				System.exit(0);
			} else { 
				System.out.print("2nd number: "); }
				
				int n2 = scan.nextInt(); 
				if( n2 > 19 || n2 < 0) {
					System.out.print(Err01); 
					System.exit(0);
				} else { 
					System.out.print("3rd number: "); }
				
					int n3 = scan.nextInt(); 
					if(n3 > 19 || n3 < 0) {
						System.out.print(Err01); 
						System.exit(0);
					} else {
						System.out.print("4th number: "); }
					
						int n4 = scan.nextInt(); 
						if(n4 > 19 || n4 < 0) {
							System.out.print(Err01); 
							System.exit(0);
						} else {
							System.out.print("5th number: "); }
						
							int n5 = scan.nextInt(); 
							if(n5 > 19 || n5 < 0) {
								System.out.print(Err01); 
								System.exit(0);
							} else {
								
								//Program continues in the rest of this else statement.
								
								//calculate sum of inputs
								int Sum = n1 + n2 +n3 + n4 + n5;
								System.out.println("\nTotal = " + Sum); 
								
								//generates random key between 0 and 9 (inclusive)
								int key = rand.nextInt(10);
								System.out.println("Your random key is " + key); 
								
								//Converts SUM from int to String
								String SumStr = String.valueOf(Sum);
																
								//Seperates each digit into its own variables
								//if sum is a 2 digit value, the if fork is taken for output
								//if sum is a 1 digit value, the else fork is taken for output								
								if (SumStr.length() > 1) {
									
									//Output if sum is 2 digits
									String d0 = SumStr.substring(0, 1);
									String d1 = SumStr.substring(1, 2);
								
									//decodes digits back to int type
									//Ciphers the digits by adding key and % 10
									int Cd0 = (Integer.decode(d0) + key) % 10;
									int Cd1 = (Integer.decode(d1) + key) % 10;
																				
									//System.out.println(SumStr+4);
									System.out.println("Your encoded number is "  + Cd0 + Cd1 );
								
								} else {
									
									//Output if sum is 1 digit
									String d0 = "0";
									String d1 = SumStr;
									
									//decodes digits back to int type
									//Ciphers the digits by adding key and % 10
									int Cd0 = (Integer.decode(d0) + key) % 10;
									int Cd1 = (Integer.decode(d1) + key) % 10;
								
									System.out.println("Your encoded number is "  + Cd0 + Cd1 );					
								
									}
								
							}
			
								
				
				
		}	
}