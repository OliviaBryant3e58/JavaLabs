import java.util.Scanner;

public class TextAnalyzer {
   
   public static int getNumOfCharacters(final String usrStr) {
      
      int numChar = 0;
      int i;
      
      for (i = 0; i < usrStr.length(); i++) {
         
         numChar++;
         
      }
      
      return numChar;
      
   }
   
   public static String outputWithoutWhitespace(String usrStr) {
      
      String noSpaceStr = usrStr.replaceAll(" ", "");
      
      return noSpaceStr;
      
   }
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      String inputString;
      int numChar;
      String noSpaceStr;
      
      System.out.println("Enter a sentence or phrase:");
      inputString = scnr.nextLine();
      
      numChar = getNumOfCharacters(inputString);
      noSpaceStr = outputWithoutWhitespace(inputString);
      
      System.out.println("\nYou entered: " + inputString);
      
      System.out.println("\nNumber of characters: " + numChar);
      System.out.println("String with no whitespace: "+ noSpaceStr);
      
   }
   
}
