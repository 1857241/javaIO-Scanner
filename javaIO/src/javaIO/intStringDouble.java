package javaIO;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class intStringDouble {

	public static void main(String[] args) {
		try {
			File myObj = new File("src\\javaIO\\intStringDouble");
			Scanner myReader = new Scanner(myObj);
			double sum = 0.0;
		      int vals = 0;
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String nums = "";
		        //Extracting just the number from the txt file
		        for(int i = 1; i < data.length(); i++) {
		        	if(data.substring(i-1, i).equals(" ")) {
		        		nums = data.substring(i);
		        		sum += Double.parseDouble(nums);
		        		vals++;
		        		//System.out.println(nums);
		        	}
		        }
		        
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
