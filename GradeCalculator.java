import java.util.ArrayList;
import java.util.Iterator;

public class GradeCalculator{
    
    /* private member variables.  Do not change these*/
    
    private ArrayList<Double> assignmentGrades = new ArrayList<>();
    private ArrayList<Double> selfStudyGrades = new ArrayList<>();
    private double midtermExam;
    private double finalExam;
    private double competenceExamTotal;
    private double labTotal;
    
    private void setAssignmentGrades(double a1, double a2, double a3){
        
        assignmentGrades.add(a1);
        assignmentGrades.add(a2);
        assignmentGrades.add(a3);
        
    }
    
    private  void setSelfStudyGrades(double s1, double s2, double s3) {
        
        selfStudyGrades.add(s1);
        selfStudyGrades.add(s2);
        selfStudyGrades.add(s3);
        
    }
    
    private  void setMidtermExamGrade(double grade) {
        
        midtermExam = grade;
        
    }
    
    private void  setFinalExamGrade(double grade) {
        
        finalExam = grade;
        
    }
    
    private void  setCompetenceExamTotal(double grade) {
        
        competenceExamTotal = grade;
        
    }
    
    private void setLabTotal(double grade) {
        
        labTotal = grade;
        
    }
    
    private double getHomeworkGrade() {
        
        double h1 = (selfStudyGrades.get(0) * assignmentGrades.get(0));
        
        double h2 = (selfStudyGrades.get(1) * assignmentGrades.get(1));
        
        double h3 = (selfStudyGrades.get(2) * assignmentGrades.get(2));
        
        double homework = h1 * .05 + h2 * .10 + h3 * .10;
        
        return homework;
        
    }
    
    public double getFinalCourseGrade() {
        
        double homework = getHomeworkGrade();
        
        double grade = homework + labTotal + competenceExamTotal + finalExam + midtermExam;
        
        return grade;
        
    }
    
    public void parseInput(String inputLine) {
        
        String singles[] = inputLine.split(",");
        
        setLabTotal(Double.parseDouble(singles[0]));
        setSelfStudyGrades(Double.parseDouble(singles[1]), Double.parseDouble(singles[2]), Double.parseDouble(singles[3]));
        setAssignmentGrades(Double.parseDouble(singles[4]), Double.parseDouble(singles[5]), Double.parseDouble(singles[6]));
        setCompetenceExamTotal(Double.parseDouble(singles[7]));
        setMidtermExamGrade(Double.parseDouble(singles[8]));
        setFinalExamGrade(Double.parseDouble(singles[9]));
        
        System.out.printf("%.2f\n", getFinalCourseGrade());
        
    }
    
}
