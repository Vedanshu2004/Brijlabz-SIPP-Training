package Employee_Records;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(1001, "Finance", 55000.0);
        emp.displayEmployeeDetails();
        System.out.println();


        emp.setSalary(60000.0);
        System.out.println("Updated Salary: ₹" + emp.getSalary());
        System.out.println();


        Manager mgr = new Manager(2001, "IT", 85000.0, 5);
        mgr.displayEmployeeDetails();     // inherited from Employee
        System.out.println();
        mgr.displayManagerDetails();      // Manager-specific method
    }
}
