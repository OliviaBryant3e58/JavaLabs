import java.util.Scanner;

public class ParseStrings {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      String lineString = "";
      int commaLocation = 0;
      String firstWord = "";
      String secondWord = "";
      boolean inputDone = false;
      
      while (!inputDone) {
         
         System.out.println("Enter input string:");
         lineString = scnr.nextLine();
         
         if (lineString.equals("q")) {
            
            inputDone = true;
            
         }
         
         else if (!lineString.contains(",")) {
            
            System.out.println("Error: No comma in string.\n");
            continue;
            
         }
         
         else {
            
            commaLocation = lineString.indexOf(',');
            firstWord = lineString.substring(0, commaLocation);
            secondWord = lineString.substring(commaLocation + 1, lineString.length());
            
            firstWord = firstWord.trim().replaceAll(" +", " ");
            secondWord = secondWord.trim().replaceAll(" +", " ");
            
            System.out.println("First word: " + firstWord);
            System.out.println("Second word: " + secondWord);
            System.out.println();
            
         }
         
      }
      
      return;
      
   }
   
}
