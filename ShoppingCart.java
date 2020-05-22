import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class ShoppingCart {
   
   //Private fields
   
   private String customerName;
   private String currentDate;
   private ArrayList<ItemToPurchase>cartItems = new ArrayList<ItemToPurchase>();
   
   //Default constructor
   
   public ShoppingCart() {
      customerName = "none";
      currentDate = "January 1, 2016";
   }
   
   public ShoppingCart(String name, String date) {
      customerName = name;
      currentDate = date;
   }
   
   //Public member methods
   
   public String getCustomerName() {
      return customerName;
   }
   
   public String getDate() {
      return currentDate;
   }
   
   public void addItem(ItemToPurchase item) {
      cartItems.add(item);
   }
   
   public void removeItem(String name) {
      
      int flag = 0;
      
      for (int i = 0; i < cartItems.size(); i++) {
         if (cartItems.get(i).getName().equals(name)) {
            cartItems.remove(i);
            flag = 1;
         }
      }
      if (flag == 0) {
         System.out.println("Item not found in cart. Nothing removed.");
      }
   }
   
   public void modifyItem(ItemToPurchase item, String name, int quantity) {
      
      int flag = 0;
      
      for (int i = 0; i < cartItems.size(); i++) {
         
         if (cartItems.get(i).getName().equals(name)) {
            
            item.setQuantity(quantity);
            System.out.println(item.getQuantity());
            
            ItemToPurchase newItem = new ItemToPurchase(name, cartItems.get(i).getDescription(), cartItems.get(i).getPrice(), quantity);
            
            cartItems.set(i, newItem);
            
            flag = 1;
            break;
         }
      }
      if (flag == 0) {
         System.out.println("Item not found in cart. Nothing modified.");
      }
   }
   
   public int getNumItemsInCart() {
      
      int numItems = 0;
      
      if (cartItems == null) {
         return numItems;
      }
      
      for (int i = 0; i < cartItems.size(); i++) {
         numItems = numItems + cartItems.get(i).getQuantity();
      }
      
      return numItems;
   }
   
   public int getCostOfCart() {
      
      if (cartItems == null) {
         return 0;
      }
      
      int totalCost = 0;
      int cost = 0;
      
      for (int i = 0; i < cartItems.size(); i++) {
         cost = (cartItems.get(i).getQuantity()) * (cartItems.get(i).getPrice());
         totalCost = totalCost + cost;
      }
      return totalCost;
   }
   
   public void printTotal() {
      
      int totalCost = getCostOfCart();
      
      if (totalCost == 0) {
         System.out.println("SHOPPING CART IS EMPTY\n");
         System.out.println("Total: $" + totalCost);
      }
      else {
         System.out.println("Total: $" + totalCost);
      }
      
   }
   
   public void printDescriptions() {
      
      System.out.println("OUTPUT ITEMS\' DESCRIPTIONS");
      
      System.out.println(getCustomerName() + "\'s Shopping Cart - " + getDate());
      
      System.out.println("\nItem Descriptions");
      
      for (int i = 0; i < cartItems.size(); i++) {
         System.out.println(cartItems.get(i).getName() + ": " + cartItems.get(i).getDescription());
      }
      
   }
   
   public void outputCart() {
      
      System.out.println("OUTPUT SHOPPING CART");
      
      System.out.println(getCustomerName() + "\'s Shopping Cart - " + getDate());
      
      System.out.println("Number of Items: " + getNumItemsInCart());
      
      for (int i = 0; i < cartItems.size(); i++) {
         if (i == 0) {
            System.out.println();
         }
         System.out.println(cartItems.get(i).getName() + " " + cartItems.get(i).getQuantity() + " @ $" + cartItems.get(i).getPrice() + " = $" + (cartItems.get(i).getPrice() * cartItems.get(i).getQuantity()));
      }
      
      System.out.println();
      
      printTotal();
      
   }
   
}
