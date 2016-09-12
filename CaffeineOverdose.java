/*
   Caffeine Overdose
   Nicolas Eldering
   9/9/2016
   Problem 10 Homework assignment 1
   This program calculates how many Coffee or Colas required to Overdose
   The main method calculates how many Coffee or Colas required to Overdose
*/

public class CaffeineOverdose 
{
   public static void main( String[] args ) 
   {
   
   int Cola = 34;             // caffeine in cola in mg
   int Coffee = 160;          // caffeine in coffee in mg
   float Death = 10000;      // caffeine amount for overdose in mg. In float to account for less then full drinks
   float ColaDead;            // a variable to catch the amount of Colas required to OD
   float CoffeeDead;          // a variable to catch teh amount of Coffee required to OD
   
   System.out.println("This program tells you how many caffeinated drinks you need to overdose on caffeine.");
   System.out.println("A leathal dose of Caffeine is 10 grams or 10000 miligrams.\n");
   System.out.println("The two drinks used in this program are a Cola with 34 mg of caffeine and a coffee with 160 mg\n");
   
   ColaDead = Death/Cola;
   CoffeeDead = Death/Coffee;
   
   System.out.println("The amount of Colas required to OD is " + ColaDead);
   System.out.println("The amount of Coffees required to OD is " + CoffeeDead);
   
   }
}
