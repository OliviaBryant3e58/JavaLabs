import java.util.Scanner;

public class LabProgram {
   
   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
      
      double cost;
      
      cost = drivenMiles / milesPerGallon * dollarsPerGallon;
      
      return cost;
      
   }
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      double milesPerGallon;
      double dollarsPerGallon;
      double cost;
      
      milesPerGallon = scnr.nextDouble();
      dollarsPerGallon = scnr.nextDouble();
      
      cost = drivingCost(10, milesPerGallon, dollarsPerGallon);
      System.out.printf("%.2f", cost);
      
      cost = drivingCost(50, milesPerGallon, dollarsPerGallon);
      System.out.printf(" %.2f", cost);
      
      cost = drivingCost(400, milesPerGallon, dollarsPerGallon);
      System.out.printf(" %.2f\n", cost);
      
   }
   
}
