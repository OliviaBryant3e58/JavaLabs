import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingService {
   
   public static void main (String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      String personName = "";
      int counter = 0;
      int youPosition = 0;
      
      Queue<String> peopleInQueue = new LinkedList<String>();
      
      personName = scnr.nextLine();
      while (!personName.equals("-1")) {
         
         peopleInQueue.add(personName);
         
         if (personName.equals("You")) {
            youPosition = counter + 1;
         }
         
         counter++;
         
         personName = scnr.nextLine();
         
      }
      
      System.out.println("Welcome to the ticketing service... ");
      System.out.println("You are number " + youPosition + " in the queue.");
      
      while (youPosition != 1) {
         
         personName = peopleInQueue.element();
         System.out.println(personName + " has purchased a ticket.");
         peopleInQueue.remove();
         youPosition--;
         System.out.println("You are now number " + youPosition);
         
      }
      
      System.out.println("You can now purchase your ticket!");
      
   }
   
}
