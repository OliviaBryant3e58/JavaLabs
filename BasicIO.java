import java.util.Scanner; 

public class OutputWithVars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int squared;
      int cubed;
      int userNumTwo;
      int add;
      int mult;

      System.out.println("Enter integer:");
      userNum = scnr.nextInt();  
      
      System.out.println("You entered: " + userNum);
      
      squared = userNum * userNum;
      System.out.println(userNum + " squared is " + squared);
      
      cubed = userNum * userNum * userNum;
      System.out.println("And " + userNum + " cubed is " + cubed + "!!");
      
      System.out.println("Enter another integer:");
      userNumTwo = scnr.nextInt();  
      
      add = userNum + userNumTwo;
      System.out.println(userNum + " + " + userNumTwo + " is " + add);
      
      mult = userNum * userNumTwo;
      System.out.println(userNum + " * " + userNumTwo + " is " + mult);
      
   }
}
