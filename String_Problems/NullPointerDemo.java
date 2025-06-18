public class NullPointerDemo {
    public static void main(String[] args) {
        // generateNullPointerException();
        handleNullPointerException();
    }

    static void generateNullPointerException() {
        String text = null;
        int length = text.length();
        System.out.println("Length: " + length);
    }

    static void handleNullPointerException() {
        try {
            String text = null;
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e);
        }
    }
}
