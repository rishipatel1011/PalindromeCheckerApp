public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("--- Palindrome Checker (Hardcoded Test) ---");

        String original = "madam"; // Hardcoded input
        String reverse = "";

        // Logic to reverse the string
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // Compare and display result
        if (original.equalsIgnoreCase(reverse)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is NOT a palindrome.");
        }
    }
}