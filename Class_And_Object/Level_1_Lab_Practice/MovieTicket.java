// MovieTicket class represents a movie ticket with booking functionality
public class MovieTicket {
    // 1. Fields (Attributes)
    private String movieName;
    private String seatNumber;
    private double price;

    // 2. Constructor - initializes with movie name only; seat and price set when booked
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null;
        this.price = 0.0;
    }

    // 3. Method to book a ticket (assign seat and update price)
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        if (seatNumber != null) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }
}
