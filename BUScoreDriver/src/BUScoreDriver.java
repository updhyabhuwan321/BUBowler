/**
 * This program is created by Bhuwan Upadhyaya
 * Date: 3/9/2024
 */

// Class for testing the Average class
import java.util.Scanner;

public class BUScoreDriver 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for the bowler's name
        System.out.print("Enter bowler's name: ");
        String bowlerName = keyboard.nextLine();

        // Create a Bowler object with the given name
        BUBowler bowler = new BUBowler(bowlerName);

        // Display bowler information using toString() method
        System.out.println(bowler.toString());

        
    }
}