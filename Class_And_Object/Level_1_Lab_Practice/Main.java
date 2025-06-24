public class Main {
    public static void main(String[] args) {
        // Create Circle objects
        // Circle circle1 = new Circle(5.0);
        // Circle circle2 = new Circle(7.2);

        // Display details of each circle
        // System.out.println("=== Circle 1 ===");
        // circle1.displayDetails();

        // System.out.println("\n=== Circle 2 ===");
        //circle2.displayDetails();



	// for Track inventory item 

	// Create Item objects
        // Item item1 = new Item(101, "Notebook", 45.50);
        // Item item2 = new Item(102, "Pen", 10.00);

        // Display details and cost for a quantity
        // System.out.println("=== Item 1 ===");
        // item1.displayDetails();
        // System.out.println("Total Cost for 5 units: ₹" + item1.calculateTotalCost(5));

        // System.out.println("\n=== Item 2 ===");
        // item2.displayDetails();
        // System.out.println("Total Cost for 10 units: ₹" + item2.calculateTotalCost(10));
	




	// for mobile phone 
	
	// Create MobilePhone objects
        // MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S22", 69999.0);
        // MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 79999.0);

        // Display details of each phone
        // System.out.println("=== Mobile Phone 1 ===");
        // phone1.displayDetails();

        // System.out.println("\n=== Mobile Phone 2 ===");
        // phone2.displayDetails();



	// for student report 
	
	// Create Student objects
        // Student student1 = new Student("Riya Sharma", 101, 87.5);
        // Student student2 = new Student("Aman Verma", 102, 58.0);

        // Display reports
        // System.out.println("=== Student 1 Report ===");
        // student1.displayReport();

        // System.out.println("\n=== Student 2 Report ===");
        // student2.displayReport();



	//for ATM 
	 // Create BankAccount object
        // BankAccount account = new BankAccount("Neha Gupta", "ACC123456", 10000.0);

        // Display initial balance
        // account.displayBalance();

        // Deposit money
        // account.deposit(5000);

        // Withdraw money
        // account.withdraw(3000);

        // Try withdrawing more than balance
        // account.withdraw(15000);

        // Display final balance
        // account.displayBalance();



	// for Palindrom check

	// PalindromeChecker pc1 = new PalindromeChecker("Madam");
        // PalindromeChecker pc2 = new PalindromeChecker("Hello World");

        // System.out.println("=== Test 1 ===");
        // pc1.displayResult();

        // System.out.println("\n=== Test 2 ===");
        // pc2.displayResult();



	// for movie ticket booking
	// Create ticket for a movie
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        MovieTicket ticket2 = new MovieTicket("Inception");

        // Display initial ticket details (not booked)
        System.out.println("=== Ticket 1 ===");
        ticket1.displayDetails();

        System.out.println("\n=== Ticket 2 ===");
        ticket2.displayDetails();

        // Book tickets
        ticket1.bookTicket("A12", 350.0);
        ticket2.bookTicket("B7", 300.0);

        // Display details after booking
        System.out.println("\n=== Ticket 1 (After Booking) ===");
        ticket1.displayDetails();

        System.out.println("\n=== Ticket 2 (After Booking) ===");
        ticket2.displayDetails();
    }


}
