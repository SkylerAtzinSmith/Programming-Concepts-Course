//-----------------------------------------------------------------------
//Converts Seconds to Hours, Minutes, and Seconds
//-----------------------------------------------------------------------

//imports the scanner class
import java.util.Scanner;

//collects user input for name and age and prints
public class TimeComp {
	public static void main(String[] args) {
		//creates scanner new object called scan
		Scanner scan = new Scanner (System.in);
		
		//collects number of seconds
		System.out.print("Input time (sec): ");
		long sec = scan.nextLong();
		
		//converts seconds to hors, mins, and seconds
		int Rsec = (int) (sec % 60);
		int min = (int) ((sec/60)%60);
		long hrs = (sec/60)/60;
				
		//prints conversion
		System.out.print(hrs + " Hours, ");
		System.out.print(min + " Minutes,");
		System.out.print(" and " + Rsec + " Seconds");
			}
}