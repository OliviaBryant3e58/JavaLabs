import java.util.Scanner;
import java.lang.String;
import java.util.GregorianCalendar;

public class BdayFind {
    
    public static void main(String [] args){
        
        //Variables
        
        Scanner scnr = new Scanner(System.in);
        Scanner inSS = null;
        
        String birthDate;
        String month;;
        String day;
        String year;
        String dayOfBirth;
        
        //User Input
        
        System.out.println("What is your birth date?:");
        birthDate = scnr.nextLine();
        
        inSS = new Scanner(birthDate);
        
        //Get the month, day, and year from input
        
        month = inSS.next();
        day = inSS.next();
        year = inSS.next();
        
        //Check year
        
        if (year.length() == 2) {
            
            year = 19 + year;
            
        }

        //Create a birthday object
        
        Birthday BirthDay = new Birthday(day, month, year);
        
        //Get the day of week
        
        dayOfBirth = BirthDay.getDayOfWeek();
        
        //Print
        
        System.out.println(dayOfBirth);
        
    }
    
}
