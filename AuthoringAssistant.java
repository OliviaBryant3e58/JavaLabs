import java.util.Scanner;

public class AuthoringAssistant {
   
   public static Scanner scnr = new Scanner(System.in);
   
   public static char printMenu() {
      
      System.out.println("\nMENU");
      System.out.println("c - Number of non-whitespace characters");
      System.out.println("w - Number of words");
      System.out.println("f - Find text");
      System.out.println("r - Replace all !'s");
      System.out.println("s - Shorten spaces");
      System.out.println("q - Quit");
      
      System.out.println("\nChoose an option:");
      
      char inputChoice = scnr.nextLine().charAt(0);
      
      return inputChoice;
      
   }
   
   public static int getNumOfNonWSCharacters(String inputString) {
      
      inputString = inputString.trim().replaceAll("\\s","");
      
      return inputString.length();
      
   }
   
   public static int getNumOfWords(String inputString) {
      
      String[] words = inputString.split("\\s+");
      
      return words.length;
      
   }
   
   public static int findText(String toFind, String inputString) {
      
      int lastIndex = 0;
      int toFindCount = 0;
      
      while (lastIndex != -1) {
         
         lastIndex = inputString.indexOf(toFind, lastIndex);
         
         if (lastIndex != -1) {
            
            toFindCount++;
            lastIndex += toFind.length();
            
         }
         
      }
      
      return toFindCount;
      
   }
   
   public static String replaceExclamation(String inputString) {
      
      String newStringE = inputString.replaceAll("!", ".");
      
      return newStringE;
      
   }
   
   public static String shortenSpace(String inputString) {
      
      String newStringS = inputString.trim().replaceAll(" +", " ");
      
      return newStringS;
      
   }
   
   public static void main(String[] args) {
      
      String inputString;
      String toFind;
      String newStringE;
      String newStringS;
      char inputChoice;
      int numNonWSChar;
      int numWords;
      int toFindCount;
      
      System.out.println("Enter a sample text:\n");
      inputString = scnr.nextLine();
      System.out.println("You entered: " + inputString);
      
      do {
         
         do {
            
            inputChoice = printMenu();
            
         } while ((inputChoice != 'c') && (inputChoice != 'w') && (inputChoice != 'f') && (inputChoice != 'r') && (inputChoice != 's') && (inputChoice != 'q'));
         
         switch (inputChoice) {
            
            case 'c':
               numNonWSChar = getNumOfNonWSCharacters(inputString);
               System.out.println("Number of non-whitespace characters: " + numNonWSChar);
               break;
            
            case 'w':
               numWords = getNumOfWords(inputString);
               System.out.println("Number of words: " + numWords);
               break;
               
            case 'f':
               System.out.println("Enter a word or phrase to be found:");
               toFind = scnr.nextLine();
               toFindCount = findText(toFind, inputString);
               System.out.println("\"" + toFind + "\" instances: " + toFindCount);
               break;
            
            case 'r':
               newStringE = replaceExclamation(inputString);
               System.out.println("Edited text: " + newStringE);
               break;
               
            case 's':
               newStringS = shortenSpace(inputString);
               System.out.print("Edited text: " + newStringS);
               break;
               
            default:
               break;
               
         }
         
      } while (inputChoice != 'q');
      
   }
   
}
