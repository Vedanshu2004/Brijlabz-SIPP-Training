// Employee class represents an employee with basic details
public class Employee {
    // 1. Fields (Attributes)
    private String name;
    private int id;
    private double salary;

    // 2. Constructor - initializes the fields
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // 3. Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: ₹" + salary);
    }
}




