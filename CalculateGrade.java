import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculateGrade
{
	/*Write a program that calculates the total grade for three classroom exercises as a
	  percentage. Use the DecimalFormat class to output the value as a percent. The
	  scores should be summarized in a table. Input the assignment information in this
	  order: name of assignment (may include spaces), points earned (integer), and total
	  points possible (integer). The percentage is the sum of the total points earned divided
	  by the total points possible. Sample input and output is shown as follows:
	
	  Exercise 		Score   Total Possible
	  Group Project 10 		10
	  Homework 		7 		12
	  Presentation 	5 		8
	  Total 		22 		30
	  
	  Your total is 22 out of 30, or 73.33%.
	 */
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String nameOfAssignment1, nameOfAssignment2, nameOfAssignment3, junk;
		int pointsEarned1, pointsEarned2, pointsEarned3;
		int outOf1, outOf2, outOf3;	
		int earnedPoints1, earnedPoints2, earnedPoints3;
		int maximumPoints earnedPoints;
		
	
		
	  	System.out.println("Enter the name of the first assignment:");
		nameOfAssignment1 = kb.nextLine();
		
			
		System.out.println("Enter the score received for the first assignment:");
		pointsEarned1 = input.nextInt();
		earnedPoints += pointsEarned1;
			
		System.out.println("Enter the total points possible for the frist assignment:");
		outOf1 = kb.nextInt();
		maximumPoints += outOf1;
		
		junk = kb.nextLine();	
		
		System.out.println("Enter the name of the second assignment:");
		nameOfAssignment2 = kb.nextLine();
		
			
		System.out.println("Enter the score received for the second assignment:");
		pointsEarned2 = input.nextInt();
		earnedPoints += pointsEarned2;
			
		System.out.println("Enter the total points possible for the second assignment:");
		outOf2 = kb.nextInt();
		maximumPoint2 += outOf2;
		
		junk = kb.nextLine();
		
		System.out.println("Enter the name of the third assignment:");
		nameOfAssignment3 = kb.nextLine();
		
			
		System.out.println("Enter the score received for the third assignment:");
		pointsEarned3 = input.nextInt();
		earnedPoints += pointsEarned3;
			
		System.out.println("Enter the total points possible for the third assignment:");
		outOf3 = kb.nextInt();
		maximumPoints += outOf3;
		
		junk = kb.nextLine();	
		
		
		
		DecimalFormat decimalFormat = new DecimalFormat("#.00%");
		
		//formatting output		
		System.out.printf("%n%-20s %-10s %-10s%n", "Exercise", "Score", "Total Possible");
		System.out.printf("%-20s %-10d %-10d%n", nameOfAssignment1, pointsEarned1, outOf1);
		System.out.printf("%-20s %-10d %-10d%n", nameOfAssignment2, pointsEarned2, outOf2);
		System.out.printf("%-20s %-10d %-10d%n", nameOfAssignment3, pointsEarned3, outOf3);
		System.out.printf("%-20s %-10d %-10d%n", "Total", totalEarned, maximumPoints);
		
		System.out.print("\nYour total is " + totalPointsEarned + " out of " + totalPointsPossible);
		System.out.println(", or " + myFormat.format((double)totalPointsEarned / totalPointsPossible) + ".");

	}
}
