import java.util.Scanner;

public class GradeTester{
    
    public static void main(String args[]){
        
        /** The main method should instantiate a Scanner
         * Get the grade string from the user instantiate a new GradeCalculator
         * Call the parseInput method for the grade calculator and get the final grade from the grade calculator - printing it to standard out
         * Hint: use the nextLine() method from the Scanner class
         */
         
        Scanner scnr = new Scanner(System.in);
        
        String inputString = scnr.nextLine();
        
        GradeCalculator grades = new GradeCalculator();
        
        grades.parseInput(inputString);
        
    }
    
}
