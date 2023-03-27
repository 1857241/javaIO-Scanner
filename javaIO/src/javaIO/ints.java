package javaIO;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class ints {

	public static void main(String[] args) {
		try {
			File myObj = new File("src\\javaIO\\ints.txt");
			Scanner myReader = new Scanner(myObj);
			double sum = 0.0;
			int vals = 0;
			while(myReader.hasNextInt()) {
				double num = Double.parseDouble(myReader.nextLine());
				sum += num;
				vals++;
				
			}
			System.out.println(sum / vals);
			myReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}

}
