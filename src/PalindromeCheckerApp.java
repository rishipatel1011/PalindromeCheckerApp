import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Advanced Palindrome Checker (Cleaning Input) ---");
        System.out.print("Enter text or phrase: ");

        String originalInput = scanner.nextLine();

        // Step 1: Remove spaces and special characters using Regex
        // Step 2: Convert to lowercase for case-insensitivity
        String cleanedInput = originalInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = "";

        // Reverse logic
        for (int i = cleanedInput.length() - 1; i >= 0; i--) {
            reversed = reversed + cleanedInput.charAt(i);
        }

        // Comparison of cleaned strings
        System.out.println("Cleaned text used for check: " + cleanedInput);

        if (!cleanedInput.isEmpty() && cleanedInput.equals(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        scanner.close();
    }
}