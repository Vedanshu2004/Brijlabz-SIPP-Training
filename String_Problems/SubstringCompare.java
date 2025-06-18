import java.util.Scanner;

public class SubstringCompare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        String manualSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("Substring by charAt method: " + manualSubstring);
        System.out.println("Substring by built-in method: " + builtInSubstring);

        boolean isEqual = compareStrings(manualSubstring, builtInSubstring);
        System.out.println("Both substrings are equal? " + isEqual);
    }

    static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
}
