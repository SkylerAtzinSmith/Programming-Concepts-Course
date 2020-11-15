import java.util.Scanner;

public class DivisorCalc {


	//Euclids algorithm in recursive method
	static int gcd (int num1, int num2) {
		
		//if num2 <= num1, and divides num1, then num2 is the highest divisor
		if (num2 <= num1 & num1 % num2 == 0) {
			return num2;
		}
		//if num1 < num2, switch the input order, to see if second input is divisible by first input
		else if (num1 < num2) {
			return gcd (num2, num1);
		}
		//keeps dividing first input by the remainder of first input/second input until the greatest common divisor is identified
		else 
			return gcd (num2, (num1 % num2));
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Input num1: ");
		int num1 = scan.nextInt();
		System.out.print("Input num2: ");
		int num2 = scan.nextInt();
		System.out.println("Greatest Common Divisor: " + DivisorCalc.gcd(num1, num2));

	}

}
