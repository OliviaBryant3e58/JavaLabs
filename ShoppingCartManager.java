import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class ShoppingCartManager {
   
   public static Scanner scnr = new Scanner(System.in);
   
   public static void printMenu (ShoppingCart cart) {
      
      char inputChoice;
      
      System.out.println("\nMENU");
      System.out.println("a - Add item to cart");
      System.out.println("d - Remove item from cart");
      System.out.println("c - Change item quantity");
      System.out.println("i - Output items\' descriptions");
      System.out.println("o - Output shopping cart");
      System.out.println("q - Quit\n");
      
   }
   
   public static void main(String[] args) {
      
      char inputChoice;
      
      System.out.println("Enter Customer's Name:");
      String name = scnr.nextLine();
      
      System.out.println("Enter Today's Date:");
      String date = scnr.nextLine();
      
      ShoppingCart cart = new ShoppingCart(name, date);
      
      System.out.println("\nCustomer Name: " + cart.getCustomerName());
      System.out.println("Today's Date: " + cart.getDate());
      
      ItemToPurchase item = new ItemToPurchase();
      
      do {
         
         printMenu(cart);
         
         do {
            
            System.out.println("Choose an option:");
            inputChoice = scnr.next().charAt(0);
      
         } while ((inputChoice != 'a') && (inputChoice != 'o') && (inputChoice != 'i') && (inputChoice != 'd') && (inputChoice != 'c') && (inputChoice != 'q'));
         
         switch (inputChoice) {
            
            case 'q':
               break;
               
            case 'a':
               System.out.println("ADD ITEM TO CART");
               
               System.out.println("Enter the item name:");
               String itemName = scnr.next() + scnr.nextLine();
               item.setName(itemName);
               itemName = item.getName();
               
               System.out.println("Enter the item description:");
               String itemDescription = scnr.nextLine();
               item.setDescription(itemDescription);
               itemDescription = item.getDescription();
               
               System.out.println("Enter the item price:");
               int itemPrice = scnr.nextInt();
               item.setPrice(itemPrice);
               itemPrice = item.getPrice();
               
               System.out.println("Enter the item quantity:");
               int itemQuantity = scnr.nextInt();
               item.setQuantity(itemQuantity);
               itemQuantity = item.getQuantity();
               
               ItemToPurchase addItem = new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity);
               cart.addItem(addItem);
               continue;
               
            case 'o':
               cart.outputCart();
               continue;
               
            case 'i':
               cart.printDescriptions();
               continue;
               
            case 'd':
               System.out.println("REMOVE ITEM FROM CART");
               System.out.println("Enter name of item to remove:");
               String rName = scnr.next() + scnr.nextLine();
               cart.removeItem(rName);
               continue;
               
            case 'c':
               System.out.println("CHANGE ITEM QUANTITY");
               System.out.println("Enter the item name:");
               String cName = scnr.next() + scnr.nextLine();
               System.out.println("Enter the new quantity:");
               int cQuan = scnr.nextInt();
               cart.modifyItem(item, cName, cQuan);
               continue;
               
            default:
               continue;
               
         }
         
      } while (inputChoice != 'q');
      
   }
   
}
