import java.Util.Scanner;

public class CommuterCostCalculator { 
  public static void main(String[] args) { 
    
    
    System.out.println("This program will calculate how much your commute cost."); 
    Scanner keyboard = new Scanner(System.in); 
    
    double miles, mpg, gasPrice, gasUsed, totalCost;
    
    System.out.print("How many miles did you drive one way to work? "); 
    miles = keyboard.nextDouble(); 
    System.out.print("What is the MPG for your car? "); 
    mpg = keyboard.nextDouble(); 
    System.out.print("How much does gas cost per gallon? "); 
    gasPrice = keyboard.nextDouble(); 
    
    totalCost = gasUsed * gasPrice;

    double consume = mile/mpg; 
    System.out.printf("You consume %.2f gallons of gas one way.%n", gasUsed); 
    System.out.printf("This trip costs you $%.2f.%n", totalCost); 
    
   
  } 
}
