import java.util.Scanner;

public class StringChange 
{

  public static void main(String[] args) 
  {
        
    Scanner kb = new Scanner(System.in);
    String originalString, newString;
      
        
    System.out.println("Please enter the string to be changed (It must contain the word hate):");
    originalString = kb.nextLine();
    newString = originalString.replaceFirst("hate", "love");
    System.out.println("I have edited that line to read:");
    System.out.println(newString);
  }

}
