//////////////////////////////////////////////////////////////////////////////////////////////////////
//																									
//Name:					Skyler Smith
//Date: 				16-Aug-2020
//Course Name:			CPSC 50100 | Programming Fundamentals										
//Semester:				Summer II 2020																
//Assignment Name:		PROGRAMMING ASSIGNMENT 3													
//Program Name:			NearestNeighbor																	
//																									
//////////////////////////////////////////////////////////////////////////////////////////////////////	
//----------------------------------------------------------------------------------------------------
//This program takes a training set of 75 samples with 4 attributes and a classifier, and finds the 
//nearest neighbor in the training set to the test set, to classify the test set, then reports accuracy
//----------------------------------------------------------------------------------------------------
//////////////////////////////////////////////////////////////////////////////////////////////////////

//Import the necessary Utilities
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class NearestNeighbor {
	
	//new method to write the training file csv to a 2D array
	public static double[][] TrainFile (String FileName) throws FileNotFoundException {
	
		//Creates new FileWriter, BufferedWriter, and PrintWriter objects
		FileReader Trfr = new FileReader(FileName);
		BufferedReader Trbr = new BufferedReader(Trfr);
	
		//new filescanner from the buffered reader object
		Scanner TrFileScan = new Scanner (Trbr);
	
		//Makes New 2D Training Set Array
		double[][] TrainArray = new double [75][4];
	
		int Row = 0;
	
		//Writes the csv into a new Array
		while (TrFileScan.hasNextLine()) {
			//read line fron csv training file
			String InputLine = TrFileScan.nextLine();
			//split the input line into an array at the commas
			String[] InArray = InputLine.split(",");
		
			//copy the content of the inArray into the Training File Array (excluding the classifier)
			for (int i = 0 ; i < InArray.length - 1; i++) {
				TrainArray[Row][i] = Double.parseDouble(InArray[i]);
			}
			//Incriment the Row to write to the next row in the array
			Row++;
		}
		TrFileScan.close();
		return TrainArray;
	}
	
	//new method to write the training file classifiers to a 1D array
	public static String[] TrainFileClasses (String FileName) throws FileNotFoundException {
		
		//Creates new FileWriter, BufferedWriter, and PrintWriter objects
		FileReader Trfr = new FileReader(FileName);
		BufferedReader Trbr = new BufferedReader(Trfr);
		
		//new filescanner from the buffered reader object
		Scanner TrFileScan = new Scanner (Trbr);
		
		//Makes New 1D Training Set Array for classifiers and 2D array to take from
		String[][] TrainArray = new String [75][5];
		String [] TrainClasses = new String [75];
		
		int Row = 0;
		
		//Writes the csv into a new Array
		while (TrFileScan.hasNextLine()) {
			//read line fron csv training file
			String InputLine = TrFileScan.nextLine();
			//split the input line into an array at the commas
			String[] InArray = InputLine.split(",");
			
			//copy the content of the inArray into the Training File Array (INCLUDING the classifier)
			for (int i = 0 ; i < InArray.length ; i++) {
				TrainArray[Row][i] = (InArray[i]);
			}
				
			TrainClasses [Row] = TrainArray [Row][4];
				
			//Incriment the Row to write to the next row in the array
			Row++;
		}
		TrFileScan.close();
		return TrainClasses;
	}
	
	//new method to write the testing file csv to a 2D array
	public static double[][] TestFile (String FileName) throws FileNotFoundException {
		
		//Creates new FileWriter, BufferedWriter, and PrintWriter objects
		FileReader Tefr = new FileReader(FileName);
		BufferedReader Tebr = new BufferedReader(Tefr);
		
		//new filescanner from the buffered reader object
		Scanner TeFileScan = new Scanner (Tebr);
		
		//Makes New 2D Training Set Array
		double[][] TestArray = new double [75][4];
	
		int Row = 0;
		
		//Writes the csv into a new Array
		while (TeFileScan.hasNextLine()) {
			//read line fron csv training file
			String InputLine = TeFileScan.nextLine();
			//split the input line into an array at the commas
			String[] InArray = InputLine.split(",");
			
			//copy the content of the inArray into the Training File Array (excluding the classifier)
			for (int i = 0 ; i < InArray.length - 1; i++) {
				TestArray[Row][i] = Double.parseDouble(InArray[i]);
			}
				
			//Incriment the Row to write to the next row in the array
			Row++;
		}
		TeFileScan.close();
		return TestArray;
	}
	
	//new method to write the Testing file True classes to a 1D array
	public static String[] TestFileClasses (String FileName) throws FileNotFoundException {

		//Creates new FileWriter, BufferedWriter, and PrintWriter objects
		FileReader Tefr = new FileReader(FileName);
		BufferedReader Tebr = new BufferedReader(Tefr);
			
		//new filescanner from the buffered reader object
		Scanner TeFileScan = new Scanner (Tebr);
			
		//Makes New 1D Training Set Array for classifiers and 2D array to take from
		String[][] TestArray = new String [75][5];
		String [] TestClasses = new String [75];
			
		int Row = 0;
			
		//Writes the csv into a new Array
		while (TeFileScan.hasNextLine()) {
			//read line fron csv training file
			String InputLine = TeFileScan.nextLine();
			//split the input line into an array at the commas
			String[] InArray = InputLine.split(",");
				
			//copy the content of the inArray into the Training File Array (INCLUDING the classifier)
			for (int i = 0 ; i < InArray.length ; i++) {
				TestArray[Row][i] = (InArray[i]);
			}
					
			TestClasses [Row] = TestArray [Row][4];
			
			//Incriment the Row to write to the next row in the array
			Row++;
		}
		TeFileScan.close();
		return TestClasses;
	}
	
	//calculate a distance matrix between the training set and the test set
	public static double[][] DistanceCalc(double[][] TrainMatrix, double[][] TestMatrix) {
	    
		
		//new array to keep track of all example distances
		double [][] DistMat = new double [75][75];
		
		//calculate distance to each testing example for each training example
		for (int j = 0 ; j<75 ; j++) {
			
			//set the point values for the training example
			double w2 =  (TrainMatrix[j][0] ) ;
			double x2 =  (TrainMatrix[j][1] ) ;
			double y2 =  (TrainMatrix[j][2] ) ;
			double z2 =  (TrainMatrix[j][3] ) ;
			
			for (int i = 0 ; i < 75 ; i++) {
			
				//set the test point values
				double w1 =  (TestMatrix[i][0] ) ;
				double x1 =  (TestMatrix[i][1] ) ;
				double y1 =  (TestMatrix[i][2] ) ;
				double z1 =  (TestMatrix[i][3] ) ;
	  
				//Calculate the distance between each test value and the training value
				double term0 = (w2 - w1) * (w2 - w1);
				double term1 = (x2 - x1) * (x2 - x1);
				double term2 = (y2 - y1) * (y2 - y1);
				double term3 = (z2 - z1) * (z2 - z1);
				double sum = term0 + term1 + term2 + term3;
				double distance = Math.abs (Math.sqrt(sum));
				
				//Record the distances to a distance matrix Rows of Test examples by Columns of Training examples
				DistMat[j][i] = distance;
			}
		}
		return DistMat;
	}
	
	//Record the column index at which the smallest distance is located to find the same label in the 1D Testing classifiers matrix
	public static int[] NeighborFinder (double[][] DistanceMatrix) {
		
		int[] IndexTracker = new int[75];
		
		//Finds and records the smallest distance index value into a 1D 75 element tracking array.
		for (int j = 0 ; j < 75 ; j++) {
			double SmallestDistance = 999999999;
			int Index = 0;
			for (int i = 0 ; i < 75 ; i++) {
				if( DistanceMatrix[j][i] < SmallestDistance){
					SmallestDistance = DistanceMatrix[j][i];
					Index = i;
					IndexTracker[j]= Index;
				}
			}
		}
		return IndexTracker;
	}
	
	public static void main(String[] args) throws FileNotFoundException {

		//New Scanner object called scanner
		Scanner scan = new Scanner(System.in);
		
		//Prints the Program & Author Info
		System.out.println("Programming Fundamentals\n" + 
							"NAME: Skyler Smith\n" + 
							"PROGRAMMING ASSIGNMENT 3\n");
		
		//Designate the training file, make a 2D array of the training file data, make a 1D array of the training file classifiers
		System.out.print("Enter the name of the training file: ");
		String TrainFileName = scan.next();		
		double [][] TrainArray = NearestNeighbor.TrainFile(TrainFileName);
		String [] TrainClasses = NearestNeighbor.TrainFileClasses(TrainFileName);
	
		//Designate the Test file, make a 2D array of the Test file data, make a 1D array of the Test file True classifiers
		System.out.print("Enter the name of the testing file: ");
		String TestFileName = scan.next();
		double [][] TestArray = NearestNeighbor.TestFile(TestFileName); 
		String [] TestClasses = NearestNeighbor.TrainFileClasses(TestFileName);

		//Close the scanner
		scan.close();
		
		//Make a distance matrix of Test samples x Training samples, and track the location of the nearest neighbor
		double DistanceMatrix [][] = NearestNeighbor.DistanceCalc(TrainArray, TestArray);
		int IndexTracker[] = NearestNeighbor.NeighborFinder(DistanceMatrix);
		
		//Print out the True label, and the Test example classifier at the recorded index (where the lowest distance was found)
		System.out.println("\nEX#: TRUE LABEL, PREDICTED LABEL");
		
		//Initialize the Positive ID counter
		double PosCt = 0;
		
		//for 75 entries spit out the True Test sample classifier followed by the identified Training classifier of the nearest neighbor
		for (int i = 0 ; i < 75 ; i++) {
			System.out.println((i+1)+ ": " + TestClasses[i] + " " + TrainClasses[IndexTracker[i]]);
			
			//Make strings of each to compare
			String v1 = TestClasses[i];
			String v2 = TrainClasses[IndexTracker[i]];
			
			//count the number of correct hits		
			if (v1.equals(v2)) {
				PosCt++;
			}
		}
		//Output accuracy (correct hits/75)
		System.out.println("ACCURACY: "+ PosCt/75);
	}
}
