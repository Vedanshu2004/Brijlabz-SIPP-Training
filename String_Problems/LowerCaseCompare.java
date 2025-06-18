import java.util.Scanner;

public class LowerCaseCompare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine();

        String ByASCII = ToLowerCase(text);
        String ByBuiltIn = text.toLowerCase();

        System.out.println("Lowercase by ASCII method: " + ByASCII);
        System.out.println("Lowercase by built-in method: " + ByBuiltIn);

        boolean isEqual = compareStrings(ByASCII, ByBuiltIn);
        System.out.println("Both methods give same result? " + isEqual);
    }

    static String ToLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
