import java.util.Scanner;

public class ShoppingCartPrinter {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();
      
      String itemName1;
      int itemPrice1;
      int itemQuantity1;
      int itemCost1;
      
      System.out.println("Item 1");
      
      System.out.println("Enter the item name:");
      itemName1 = scnr.nextLine();
      item1.setName(itemName1);
//      System.out.println(itemName1); // debug
      
      System.out.println("Enter the item price:");
      itemPrice1 = scnr.nextInt();
      item1.setPrice(itemPrice1);
//      System.out.println(itemPrice1); // debug
      
      System.out.println("Enter the item quantity:");
      itemQuantity1 = scnr.nextInt();
      item1.setQuantity(itemQuantity1);
//      System.out.println(itemQuantity1); // debug
      
      itemName1 = item1.getName();
      itemQuantity1 = item1.getQuantity();
      itemPrice1 = item1.getPrice();
      itemCost1 = itemPrice1 * itemQuantity1;
      
      //-----------------------------------------------------------------------------------------------------//
      
      String itemName2;
      int itemPrice2;
      int itemQuantity2;
      int itemCost2;
      
      System.out.println("\nItem 2");
      
      System.out.println("Enter the item name:");
      itemName2 = scnr.next() + scnr.nextLine();
      item2.setName(itemName2);
//      System.out.println(itemName2); // debug
      
      System.out.println("Enter the item price:");
      itemPrice2 = scnr.nextInt();
      item2.setPrice(itemPrice2);
//      System.out.println(itemPrice2); // debug
      
      System.out.println("Enter the item quantity:");
      itemQuantity2 = scnr.nextInt();
      item2.setQuantity(itemQuantity2);
//      System.out.println(itemQuantity2); // debug
      
      itemName2 = item2.getName();
      itemQuantity2 = item2.getQuantity();
      itemPrice2 = item2.getPrice();
      itemCost2 = itemPrice2 * itemQuantity2;
      
      //-----------------------------------------------------------------------------------------------------//
      
      int totalCost;
      
      totalCost = itemCost1 + itemCost2;
      
      System.out.println("\nTOTAL COST");
      
      System.out.println(itemName1 + " " + itemQuantity1 +  " @ $" + itemPrice1 + " = $" + itemCost1);
      System.out.println(itemName2 + " " + itemQuantity2 +  " @ $" + itemPrice2 + " = $" + itemCost2);
      System.out.println("\nTotal: $" + totalCost);
      
   }
   
}
