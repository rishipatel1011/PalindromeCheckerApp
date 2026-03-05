import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Optimized Palindrome Checker (StringBuilder) ---");
        System.out.print("Enter text: ");

        String input = scanner.nextLine();
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use StringBuilder for efficient string manipulation
        StringBuilder reversedBuilder = new StringBuilder();

        // Iterate backwards and append to the builder
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversedBuilder.append(cleaned.charAt(i));
        }

        String reversed = reversedBuilder.toString();

        if (!cleaned.isEmpty() && cleaned.equals(reversed)) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }
}