import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.next();

        System.out.print("Enter second string: ");
        String str2 = input.next();

        boolean charAtResult = compareUsingCharAt(str1, str2);
        boolean equalsMethodResult = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsMethodResult);

        if (charAtResult == equalsMethodResult) {
            System.out.println("Both methods return the same result.");
        } else {
            System.out.println("Methods returned different results.");
        }
    }

    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
