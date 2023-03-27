package javaIO;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class popularBabyNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      File myObj = new File("src\\javaIO\\Popular_Baby_Names.csv");
		      Scanner myReader = new Scanner(myObj);
		      int count = 0;
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        if(data.substring(5,11).equals("FEMALE")) {
		        	count++;
		        }
		        
		      }
		      System.out.println(count);
		      
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
