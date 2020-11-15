//Imports scanner and io classes
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise2 {
			
	public static void main(String[] args) throws IOException {
	
		//Designates file name for new output file
		String FileName = "userStrings.txt";
		
		//Creates new FileWriter, BufferedWriter, and PrintWriter objects
		FileWriter fw = new FileWriter(FileName);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		//Creates new File object called file with the path FileName and scanner object called fileScan that scans the file
		File file = new File (FileName);
		//Scanner fileScan = new Scanner (file);
		
		//makes new scanner object (keyboard input)
		Scanner sc = new Scanner (System.in);
		
		//initializes entry variable and prints to file
		String entry = sc.nextLine();
		outFile.println(entry);

		//loops entry until user enters "DONE". Does not print DONE to file
		while (!entry.equals("DONE")) {
		entry = sc.nextLine();
			if (!entry.equals("DONE")) {
				outFile.println(entry);
			} else {
				outFile.close();
			}
		} 
		//closes the scanner keyboard input
		sc.close();
	}
}
