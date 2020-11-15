//imports the java Array utility classes
import java.util.Arrays;

public class Numbers {

	public static void nextLargest(int [] array) {
	
		//sorts the array of integers in ascending order
		Arrays.sort(array);
		
		//prints the values with their next highest values
		for(int i = 0 ; i < (array.length - 1) ; i++) {
			if(i < array.length) {
				System.out.println(array[i] + ": " + array[i+1]);
			}
		}
		//prints the highest value with next to the max value of Integer
		System.out.println(array[(array.length)-1] + ": " + Integer.MAX_VALUE);
	}
		
	public static void main(String[] args) {
		
		//generate array 
		int [] array1 = {78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19};
		
		//invoke nextLargest method
		Numbers.nextLargest(array1);
	}

}
