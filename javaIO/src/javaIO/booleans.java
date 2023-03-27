package javaIO;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class booleans {

	public static void main(String[] args) {
		
		try {
			File bools = new File("src\\javaIO\\boolean.txt");
			Scanner myReader = new Scanner(bools);
			String[][] arr = new String[8][9];
			while(myReader.hasNextLine()) {
				for(int r = 0; r < arr.length; r++) {
					for(int c = 1; c < myReader.nextLine().length()-1; c++) {
						arr[r][c] = myReader.nextLine().substring(c-1, c);
						System.out.print(arr[r][c]);
					}
					System.out.println("");
				}
			}

		myReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}

}
