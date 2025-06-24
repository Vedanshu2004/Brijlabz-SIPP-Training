public class Product{
    public String productName;
    public double price;
    public static int totalProducts ;
    


    public Product(String productName , double price ){
        this.productName = productName ;
	this.price = price ;
	totalProducts++;
    }

    public void displayProductDetails(){
        System.out.println("ProductName :- " + productName);
	System.out.println("Price :- " + price);
    }

    public static void displayTotalProducts(){
        System.out.println("TotalProducts :- " + totalProducts);
    }
}