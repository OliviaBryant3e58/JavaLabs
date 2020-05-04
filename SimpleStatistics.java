import java.util.Scanner;

public class LabProgram {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      int num1;
      int num2;
      int num3;
      int num4;
      int product;
      int average;
      double productD;
      double averageD;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      
      product = num1 * num2 * num3 * num4;
      
      average = (num1 + num2 + num3 + num4) / 4;
      
      System.out.println((int)product + " " + (int)average);
      
      productD = (double)num1 * (double)num2 * (double)num3 * (double)num4;
      
      averageD = ((double)num1 + (double)num2 + (double)num3 + (double)num4) / 4.0;
      
      System.out.printf("%.3f %.3f\n", productD, averageD);
      
   }
   
}
