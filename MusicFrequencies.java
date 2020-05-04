import java.util.Scanner;

public class LabProgram {
   
   public static void printKeys(double inputKey) {
      
      double r = Math.pow(2.0, 1.0/12.0);
      double key;
      double n;
      
      for (n = 1.0; n <= 4; n++) {
         
         key = inputKey * Math.pow(r, n);
         
         System.out.printf(" %.2f", key);
         
      }
      
   }
   
   public static void main(String[] args) {
      
      double inputKey;
      
      Scanner scnr = new Scanner(System.in);
      
      inputKey = scnr.nextDouble();
      
      System.out.printf("%.2f", inputKey);
      
      printKeys(inputKey);
      
      System.out.print("\n");
      
   }
   
}
import java.util.Scanner;

public class LabProgram {
   
   public static void printKeys(double inputKey) {
      
      double r = Math.pow(2.0, 1.0/12.0);
      double key;
      double n;
      
      for (n = 1.0; n <= 4; n++) {
         
         key = inputKey * Math.pow(r, n);
         
         System.out.printf(" %.2f", key);
         
      }
      
   }
   
   public static void main(String[] args) {
      
      double inputKey;
      
      Scanner scnr = new Scanner(System.in);
      
      inputKey = scnr.nextDouble();
      
      System.out.printf("%.2f", inputKey);
      
      printKeys(inputKey);
      
      System.out.print("\n");
      
   }
   
}
