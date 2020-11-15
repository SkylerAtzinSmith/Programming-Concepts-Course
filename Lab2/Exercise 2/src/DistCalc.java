//-----------------------------------------------------------------------
//calculates the distance from point a to point b
//-----------------------------------------------------------------------

//imports the Scanner class
import java.util.Scanner;
//imports the DecimalFormat class
import java.text.DecimalFormat;

public class DistCalc {
	public static void main(String[] args) {
		//creates scanner new object called scan
		Scanner scan = new Scanner (System.in);
			
		//creates new user-generated variables for coordinates of points a and b
		System.out.print("Enter the X-coordinate of point a: ");
		int x1 = scan.nextInt();
		System.out.print("Enter the Y-coordinate of point a: ");
		int y1 = scan.nextInt();
		System.out.print("Enter the X-coordinate of point b: ");
		int x2 = scan.nextInt();
		System.out.print("Enter the Y-coordinate of point b: ");
		int y2 = scan.nextInt();
		
		//confirms coordinates entered to user
		System.out.println("\nYou entered: \npoint a:(" +
		x1 + "," + y1 +
		") & point b:(" +
		x2 +","+ y2 + ")" );
		
		//calculates the distance from a to b and reports value
		Double Dist =Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
		
		//creates new DecimalFormat object called sigfig to simplify calculation
		DecimalFormat sigfig = new DecimalFormat("#####################.###");
				
		//prints result
			System.out.println("\ndistance betwen a and b = " + sigfig.format(Dist));
			}
}