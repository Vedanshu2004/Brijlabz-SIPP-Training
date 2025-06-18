import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        // generateStringIndexOutOfBoundsException();
        handleStringIndexOutOfBoundsException();
    }

    static void generateStringIndexOutOfBoundsException() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        char ch = text.charAt(text.length()); // This will throw exception
        System.out.println("Character: " + ch);
    }

    static void handleStringIndexOutOfBoundsException() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        try {
            char ch = text.charAt(text.length()); // Out of bounds
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e);
        }
    }
}
