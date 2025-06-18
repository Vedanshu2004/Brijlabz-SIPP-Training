import java.util.Scanner;

public class StringCharArrayCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        char[] userDefinedChars = getChars(text);
        char[] builtInChars = text.toCharArray();

        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        System.out.println("User-defined char array:");
        for (char ch : userDefinedChars) {
            System.out.print(ch + " ");
        }

        System.out.println("\nBuilt-in toCharArray() output:");
        for (char ch : builtInChars) {
            System.out.print(ch + " ");
        }

        System.out.println("\nAre both arrays equal? " + areEqual);
    }

    static char[] getChars(String text) {
        int length = text.length();
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
