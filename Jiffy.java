import java.util.Scanner;

public class LabProgram {
   
   public static double secondsToJiffies(double userSeconds) {
      
      double jiffy;
      
      jiffy = userSeconds * 100;
      
      return jiffy;
      
   }
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      double inputNum;
      double jiffy;
      
      inputNum = scnr.nextDouble();
      
      jiffy = secondsToJiffies(inputNum);
      
      System.out.printf("%.2f", jiffy);
      
   }
   
}
