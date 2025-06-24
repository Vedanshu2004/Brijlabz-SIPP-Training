package Employee_Records;

public class Manager extends Employee {
    int teamSize;

    // Constructor
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }


    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);      // public
        System.out.println("Department: " + department);      // protected
        System.out.println("Team Size: " + teamSize);
    }
}
