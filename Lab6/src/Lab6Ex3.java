import java.util.Scanner;

public class Lab6Ex3 {

	static int bar(int N) {
		 int result = 1;
		 for (int i=1; i<N; i*=2)
		 result+=2;

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
		System.out.print(bar(n));

		//The time complexity is proportional to the number of times n can be divided by 2
		System.out.println("\nThe time complexity for bar is O(log(n))");

	}

}
