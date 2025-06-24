// Circle class represents a geometric circle with radius
public class Circle {
    // 1. Fields (Attributes)
    private double radius;

    // 2. Constructor - initializes the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // 3. Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}
