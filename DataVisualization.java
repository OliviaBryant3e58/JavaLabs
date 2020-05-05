import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DataVisualizer {
   
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> authorName = new ArrayList<String>();
      ArrayList<String> numBooks = new ArrayList<String>();
      
      String title;
      String col1;
      String col2;
      String dataPoints;
      int commaLocation;
      String author;
      String numNovels;
      int bookStars;
      
      System.out.println("Enter a title for the data:");
      title = scnr.nextLine();
      System.out.println("You entered: " + title);
      System.out.println();
      
      System.out.println("Enter the column 1 header:");
      col1 = scnr.nextLine();
      System.out.println("You entered: "+ col1);
      System.out.println();
      
      System.out.println("Enter the column 2 header:");
      col2 = scnr.nextLine();
      System.out.println("You entered: " + col2);
      System.out.println();
      
      do {
         
         System.out.println("Enter a data point (-1 to stop input):");
         dataPoints = scnr.nextLine();
         
         if (dataPoints.equals("-1")) {
            
            break;
            
         }
         
         else if (!dataPoints.contains(",")) {
            
            System.out.println("Error: No comma in string.");
            System.out.println();
            continue;
            
         }
         
         else if (!dataPoints.matches(".*\\d.*")) {
            
            System.out.println("Error: Comma not followed by an integer.");
            System.out.println();
            continue;
            
         }
         
         else if (dataPoints.contains(",")) {
            
            int count = 0;
            int location;
            
            for (int m = 0; m < dataPoints.length(); m++) {
               
               if(dataPoints.charAt(m) == ',') {
                  
                  count++;
                  
               }
               
            }
            
            if (count > 1) {
               
               System.out.println("Error: Too many commas in input.");
               System.out.println();
               continue;
               
            }
            
            else if (count == 1) {
               
               commaLocation = dataPoints.indexOf(',');
               author = dataPoints.substring(0, commaLocation);
               numNovels = dataPoints.substring(commaLocation + 1, dataPoints.length());
               
               author = author.trim().replaceAll(" +", " ");
               numNovels = numNovels.trim().replaceAll(" +", " ");
               
               System.out.println("Data string: " + author);
               System.out.println("Data integer: " + numNovels);
               System.out.println();
               
               authorName.add(author);
               numBooks.add(numNovels);
               
               continue;
               
            }
            
         }
         
         else {
            
            commaLocation = dataPoints.indexOf(',');
            author = dataPoints.substring(0, commaLocation);
            numNovels = dataPoints.substring(commaLocation + 1, dataPoints.length());
            
            author = author.trim().replaceAll(" +", " ");
            numNovels = numNovels.trim().replaceAll(" +", " ");
            
            System.out.println("Data string: " + author);
            System.out.println("Data integer: " + numNovels);
            System.out.println();
            
            authorName.add(author);
            numBooks.add(numNovels);
            
         }
         
      } while (!dataPoints.equals("-1"));
      
      System.out.println();
      System.out.printf("%33s\n", title);
      System.out.printf("%-20s|%23s\n", col1, col2);
      System.out.println("--------------------------------------------");
      
      for (int i = 0; i < authorName.size(); i++) {
         
         System.out.printf("%-20s|%23s\n", authorName.get(i), numBooks.get(i));
         
      }
      
      System.out.println();
      
      for (int j = 0; j < authorName.size(); j++) {
         
         System.out.printf("%20s ", authorName.get(j));
         
         bookStars = Integer.parseInt(numBooks.get(j));

         for (int k = 0; k < bookStars; k++) {
            
            System.out.print("*");
            
         }
         
         System.out.println();
         
      }
      
   }
   
}
