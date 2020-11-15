//imports the Scanner, Arrays, & Random Class
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Lab6Ex1 {

	public static void main(String[] args) {

		//new scanner and random objects
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("How many entries in your number list: ");
		
		//enter array size, close the scanner
		int n = scan.nextInt();
		scan.close();
		
		//new array of size n
		int array [] = new int [n];
		
		//O(n) efficiency to generate random entries in the array
		for (int i = 0 ; i < array.length; i++ ) {
			array[i] = rand.nextInt(1000)+1;
		}
		
		//Print The Unsorted Array
		System.out.println("Unsorted Array: " + Arrays.toString(array));
		
		//O(n^3) sorting algorithm: By nesting the selection sort algorithm, which has O(n^2) efficiency in a for loop (for every n indexes)
		//the sort algorithm is raised from O(n^2) to O(n^3)	
		for (int k = 0 ; k < array.length; k++ ) {
				
			//Selection Sort algorithm, with O(n^2)
			for (int i = 0; i < array.length - 1; i++)  {
		            
				int index = i;  
		            
		        for (int j = i + 1; j < array.length; j++) {  
		            	
		        	//searches the array for the next lowest value in the array
		        	if (array[j] < array[index]) {  
		                   
		            	//replaces the next index value being compared with the index value at which the lower number exists if a lowest value exists downstream in the array
		            	index = j; 
		        	}  
		        }  
		            
		    //Swaps the values at the indexes, doesn't change anything if lower value is not found, b/c array[index] is the same thing as array[i]
		    int lowerVal = array[index];   
		    array[index] = array[i];  
		    array[i] = lowerVal;  
		    }  
		}
		//Print sorted Array
		System.out.println("Sorted Array: " + Arrays.toString(array));
	}
}
