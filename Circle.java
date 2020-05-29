import java.lang.Math;

public class Circle {
    
    private double radius;
    private double area;
    private double diameter;
    private double circumference;
    
    public Circle(double newRadius) {
        //The constructor initializes radius to the argument value
        // parameter newRadius - new radius of a circle
        radius = newRadius;
    }
    
    public void calculateDiameter() {
        //This method is used to calculate and set the diameter of a circle
        diameter = 2.0 * radius;
    }
    
    public void calculateCircumference() {
        //This method is used to calculate and set the length of circumference of a circle
        circumference = 2.0 * Math.PI * radius;
    }
    
    public void calculateArea() {
        //This method is used to calculate the area of a circle
        area = Math.PI * Math.pow(radius, 2.0);
    }
    
    public double getRadius() {
        //This method is used to get the radius of a circle
        return radius;
    }
    
    public void setRadius(double newRadius) {
        //This method is used to set the radius of a circle
        radius = newRadius;
    }
    
    public double getArea() {
        //This method is used to get the area of a circle
        return area;
    }
    
    public double getDiameter() {
        //This method is used to get the diameter of a circle
        return diameter;
    }
    
    public double getCircumference() {
        //This method is used to get the circumference of a circle
        return circumference;
    }
    
}
