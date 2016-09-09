/*
   GumballsAndCandy
   Nicolas Eldering
   9/9/2016
   Problem 2 Homework assignment 1
   This program calculates how many Candy and Gumballs you can get with your arcade coupons
   The main method calculates candy, gumballs, and remaining coupons then returns strings with the information
*/
public class GumballsAndCandy 
{
   public static void main( String[] args ) 
   {
      int Coupons = 109; // Coupons you have - hard coded in
      int Candy;         // To catch the amount of Candy Bars
      int Gumballs;      // To catch the amount of Gumballs
      
      System.out.println("This program calculates how many Candy and Gumballs you can get with your arcade coupons with priority on Candy.");
      System.out.println("The cost of Candy is 10 coupons per bar.");
      System.out.println("The cost of Gumballs is 3 coupons per bar.");
      System.out.println("You started with " + Coupons);
      
      Candy = Coupons/10; // since 10 is the cost of Candy
      Coupons = Coupons%10; // remaining coupons
      Gumballs = Coupons/3; // Gumballs cost 3
      Coupons = Coupons%3; // remaining coupons
      
      
      System.out.println("You were able to purchase " + Candy + " Candy Bars");
      System.out.println("You were able to purchase " + Gumballs + " Gumballs");
      System.out.println("You have " + Coupons + " coupons remaining");
   }
}
