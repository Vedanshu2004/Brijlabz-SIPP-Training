import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        // generateException(text);
        handleIllegalArgument(text);
    }

    static void generateException(String text) {
        String sub = text.substring(5, 2);
        System.out.println("Substring: " + sub);
    }

    static void handleIllegalArgument(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e);
        }
    }
}
