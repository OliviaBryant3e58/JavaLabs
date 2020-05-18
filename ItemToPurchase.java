public class ItemToPurchase {
   
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   
   public void setName(String name) {
      
      itemName = name;
      
   }
   
   public String getName() {
      
      return itemName;
      
   }
   
   public void setPrice(int price) {
      
      itemPrice = price;
      
   }
   
   public int getPrice() {
      
      return itemPrice;
      
   }
   
   public void setQuantity(int quantity) {
      
      itemQuantity = quantity;
      
   }
   
   public int getQuantity() {
      
      return itemQuantity;
      
   }

}
