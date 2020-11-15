//imports the Scanner, 
import java.util.Scanner;

public class Lab6Ex2 {
	
	//Method to find Time complexity
	static int foo(int N) {
		 int result = 0;
		 
		 for (int i=0; i<N; i++)
		 result++;
		
		 for (int j=0; j<1000000; j++)
		 result+=j;

		 return result;
		 
		}
	
	public static void main(String[] args) {
		
		//new input for foo
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = scan.nextInt();
		scan.close();
		
		//run foo
		System.out.print("Result = ");
		System.out.print(foo(n));

		//The time complexity is porportional to n loops + 1000000 loops
		System.out.println("\nThe time complexity for foo is O(n+1000000"));

	}

}
