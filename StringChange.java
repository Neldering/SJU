public class StringChange {
import java.util.Scanner;

  public static void main(String[] args) {
        
      Scanner kb = new Scanner(System.in);
        
      System.out.println("Please enter the string to be changed (It must contain the word hate):");
      String originalString = kb.nextLine();
      newString = originalString.replaceFirst("hate", "love");
      System.out.println("I have rephrased that line to read:");
      System.out.println(newString);
    }

}