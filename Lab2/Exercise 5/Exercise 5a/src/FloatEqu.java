//-----------------------------------------------------------------------
//Checks the equivalency of 2 doubles
//-----------------------------------------------------------------------

public class FloatEqu {
	public static void main(String[] args) {
		//defines the doubles a & b
		double a = (1.0/10)*(1.0/10);
		double b = (1.0/100);

		//prints the values for the user to see
		System.out.println("a = (1.0/10)*(1.0/10) = " + a);
		System.out.println("b = (1.0/100) = " + b);
		
		//Reports the equivalency and expectedness of the Result, depending on the equivelency
		System.out.println("\nThese values are:\n");
		
		//Reports equivalency
		if(a == b) {
			System.out.println("EQUAL");
		} else { 
			System.out.println("NOT EQUAL");
		}
		
		//Reports expectedness
		if(a != b) {
			System.out.println("\n...This is Unexpected");
		} else { 
			System.out.println("\nThis is Expected");
		}
	}
}
