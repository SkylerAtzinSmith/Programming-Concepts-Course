//Imports scanner and io classes
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise1 {
	
	public static void main(String[] args) throws IOException {
		
		//Designates file name for new output file
		String FileName = "Output.csv";
		
		//Creates new FileWriter, BufferedWriter, and PrintWriter objects
		FileWriter fw = new FileWriter(FileName);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		//Uses the PrintWriter class to write the lines of numbers to a new file
		outFile.println("1,4,6,7,8");
		outFile.println("2,3,1,5,6");
		outFile.println("3,2,1,4,5");		
		outFile.close();
		
		//Creates new File object called file with the path FileName and scanner object called fileScan that scans the file
		File file = new File (FileName);
		Scanner fileScan = new Scanner (file);
		 
		//Set the default number of lines in the file to 1
		int LnCount = 1;
		
		System.out.println("Maximum values");
		
		//do the following as long as there is a next line in the file
		do {
			
			//initialize largest value
			int LargestValue = 0;
			
			///Set the Delimiter as new line, for each new line: concatonate the tokens into a string
			fileScan.useDelimiter("\n");
			String R1 = fileScan.next();
			String R1Rep = R1.replace(",", "");
			
			//Print the Row being analyzed
			System.out.print("Row "+LnCount+": ");
			
			//Initialize Largest Value Converter
			int LvConv = 0;
			
			//For every digit in the string, take the value of the character
			for (int i = 0 ; i < R1Rep.length()-1; i++) {
				
				//replace LargestValue with only the highest values
				int iNum = Integer.valueOf(R1Rep.charAt(i));
				if (iNum > LargestValue) {
					LargestValue = iNum;	
				}
				
				//Convert back from unicode to number
				switch (LargestValue) {
				case 48: LvConv = 0;
				break;
				case 49: LvConv = 1;
				break;
				case 50: LvConv = 2;
				break;
				case 51: LvConv = 3;
				break;
				case 52: LvConv = 4;
				break;
				case 53: LvConv = 5;
				break;
				case 54: LvConv = 6;
				break;
				case 55: LvConv = 7;
				break;
				case 56: LvConv = 8;
				break;
				case 57: LvConv = 9;
				break;
				}
			}
			
			//print out the converted Largest Value
			System.out.println(LvConv);
			
			//add 1 to the line count
			LnCount++;
			
		} while (fileScan.hasNext());
		
		//close fileScan
		fileScan.close();
		
	}

}
