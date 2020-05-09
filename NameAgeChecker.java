import java.util.Scanner;
import java.util.InputMismatchException;

public class NameAgeChecker {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      String inputName;
      int age;
      
      inputName = scnr.next();
      
      while (!inputName.equals("-1")) {
         
         try {
            
            age = scnr.nextInt();
            
         }
         catch (InputMismatchException ex) {
            
            age = -1;
            scnr.nextLine();
            
         }
         
         System.out.println(inputName + " " + (age + 1));
         inputName = scnr.next();
         
      }
      
   }
   
}
