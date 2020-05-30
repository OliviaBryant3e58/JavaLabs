public class Pet {

   protected String petName;
   protected int petAge;

   public void setName(String userName) {
      petName = userName;
   }

   public String getName() {
      return petName;
   }

   public void setAge(int userAge) {
      petAge = userAge;
   }

   public int getAge() {
      return petAge;
   }

   public void printInfo() {
      System.out.println("Pet Information: ");
      System.out.println("   Name: " + petName);
      System.out.println("   Age: " + petAge);
   }

}