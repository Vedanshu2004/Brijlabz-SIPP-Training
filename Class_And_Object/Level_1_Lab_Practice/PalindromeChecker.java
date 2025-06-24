// PalindromeChecker class to check palindrome status of a given text
public class PalindromeChecker {
    // 1. Fields (Attributes)
    private String text;

    // 2. Constructor - initializes the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // 3. Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversed);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}
