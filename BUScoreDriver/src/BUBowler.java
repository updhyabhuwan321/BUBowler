/**
 * This program is created by Bhuwan Upadhyaya
 * Date: 3/9/2024
 */

import java.util.Scanner;

public class BUBowler {
    private String name;
    private int[] scores;
    private int highScore;
    private double average;

    // Constructor
    public BUBowler(String name)
    {
        this.name = name;
        scores = new int[4]; // Initialize scores array with size 4
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++)
        {
            System.out.print("Enter bowling score " + (i + 1) + ": ");
            scores[i] = keyboard.nextInt();
        }
        

        selectionSort();
        getHighScore();
        calculateAverage();
    }

    // Method to perform selection sort on scores array
    private void selectionSort()
    {
        for (int i = 0; i < scores.length - 1; i++)
        {
            int maxIndex = i;
            for (int j = i + 1; j < scores.length; j++)
            {
                if (scores[j] > scores[maxIndex])
                {
                    maxIndex = j;
                }
            }
            // Swap scores[i] with scores[maxIndex]
            int temp = scores[i];
            scores[i] = scores[maxIndex];
            scores[maxIndex] = temp;
        }
    }

    // Method to find the highest bowling score
    private void getHighScore() 
    {
        highScore = scores[0]; // Assuming scores array is sorted in descending order
    }

    // Method to calculate the average of bowling scores
    
    private void calculateAverage() 
    {
        int total = 0;
        for (int score : scores) 
        {
            total += score;
        }
        average = (double) total / scores.length;
    }

    // Method to return string representation of Bowler object

public String toString() 
{
    String result = "Bowler's Name: " + name + "\n";
    result += "Highest Score: " + highScore + "\n";
    result += "Average Score: " + average + "\n";
    result += "Bowling Scores (Descending Order): ";
    for (int score : scores) 
    {
        result += score + " ";
    }
    return result;
    }
}