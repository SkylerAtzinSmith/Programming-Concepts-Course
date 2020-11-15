import java.util.Scanner;

public class StringReversal {

	static String reverseString (String Str) {

		//base case, if string is 1 element or less, the string itself is returned
		if(Str.length() <= 1) {
	         return Str;
	      //passes substring back into reverseString method, now one character shorter than before, and continues until length is <=1
	      //each time this happens, it is adding the first character of the substring to the end
	      } else {
	         return reverseString(Str.substring(1))+Str.charAt(0);
	      }
	   }
	
	public static void main(String[] args) {
		
		//new scanner
		Scanner scan = new Scanner (System.in);
		//use scanner to make String
		System.out.print("Enter A string: ");
		String String = scan.nextLine();
		//close scanner
		scan.close();
		
		//Invoke the recursive method to reverse the string.
		System.out.println("Reversed String: " + StringReversal.reverseString(String));

	}

}
