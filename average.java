/*
 * Programmer: Ash Yaw
 * 
 * Class: CIS 113
 * 
 * Date: 10/1/2020
 * 
 * Program Description: Takes a input of numbers double's or integer's and computes the average and outputs that as a integer rounded down
 * 
 * 
 */


package cis113;
import java.util.*;

public class average //describes what it does 
{

	public static void main(String[] args) 
	{
		try // adding that try statement for defensive programming
		{	
			
			Scanner scan = new Scanner(System.in); // create my scanner
			System.out.println("Enter your numbers with a , seperating them");
			while(scan.hasNextLine())	// more defensive programming
			{
		 		ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // created an array list for this project because i like using them and its expandable
		 		
		 		String line = scan.nextLine();					// this is how i'm setting up my single line input
		 		String[] tokens = line.split(",");				// tokens method, alot of defense industries read every piece of data in as strings and convert them from there
		 		scan.close();									// close that scanner 
		 		
		 		for(int i = 0; i < tokens.length; ++i)			// loop to add to the array list as it splits the input up into sections separated by the "," key when the user enters them
		 		{
		 			
		 			int k = (int) Double.parseDouble(tokens[i]); //parse it as a double to allow both integers and doubles to be scanned but ultimately casted to an int
		 			myNumbers.add(k);		// add it to the array list
		 			
		 		}
		 		
		 		System.out.print("List: " + myNumbers + ", Average: "); // output format
		 		System.out.println(averages(myNumbers)); //outputs what the function averages returns
			}
			
		}
		
		catch(Exception e)
		{
			System.out.println("Error: " + e.toString()); // that catch statement error output
		}
		
	}
	
	public static int averages(ArrayList<Integer> myNumbers) //averages function 
	{
		
		int i,total = 0;
		
		for(i = 0; i < myNumbers.size(); ++i)		// had to use .size() because its an arraylist 
		{
			total += myNumbers.get(i); //+= means total = total + myNumbers.get(i)
		}
		
		return total/myNumbers.size(); // save small amounts of data by just returning it as a math function and not as a variable storing that function
		
	}

}
