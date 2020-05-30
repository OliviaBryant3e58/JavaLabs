public class Encyclopedia extends Book {
   
   private String edition;
   private int numVolumes;
   
   public void setEdition(String str) {
      edition = str;
   }
   
   public void setNumVolumes(int num) {
      numVolumes = num;
   }
   
   public String getEdition() {
      return edition;
   }
   
   public int getNumVolumes() {
      return numVolumes;
   }
   
   public void printInfo() {
      super.printInfo();
      System.out.println("   Edition: " + edition);
      System.out.println("   Number of Volumes: " + numVolumes);
   }
   
}
