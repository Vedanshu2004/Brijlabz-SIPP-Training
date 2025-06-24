// Item class represents an inventory item with basic details
public class Item {
    // 1. Fields (Attributes)
    private int itemCode;
    private String itemName;
    private double price;

    // 2. Constructor - initializes the fields
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // 3. Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: ₹" + price);
    }

    // Method to calculate total cost based on quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
