import java.util.Scanner;

public class ArrayIndexDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        handleArrayIndexOutOfBounds(names);
    }

    static void generateException(String[] arr) {
        System.out.println("Accessing index out of bounds (unhandled)...");
        System.out.println(arr[5]);
    }

    static void handleArrayIndexOutOfBounds(String[] arr) {
        try {
            System.out.println("Accessing index out of bounds (handled)...");
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught specific exception: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught generic runtime exception: " + e);
        }
    }
}
