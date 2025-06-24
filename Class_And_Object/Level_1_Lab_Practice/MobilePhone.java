// MobilePhone class represents a mobile device with basic details
public class MobilePhone {
    // 1. Fields (Attributes)
    private String brand;
    private String model;
    private double price;

    // 2. Constructor - initializes the fields
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // 3. Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}
