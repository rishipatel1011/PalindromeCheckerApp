import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Case-Insensitive Palindrome Checker ---");
        System.out.print("Enter text: ");

        String originalInput = scanner.nextLine();

        // Convert input to lowercase to handle case-insensitivity
        String processedInput = originalInput.toLowerCase();
        String reversed = "";

        // Reverse logic
        for (int i = processedInput.length() - 1; i >= 0; i--) {
            reversed = reversed + processedInput.charAt(i);
        }

        // Comparison of lowercase strings
        if (processedInput.equals(reversed)) {
            System.out.println("Result: '" + originalInput + "' is a palindrome (Case-Insensitive).");
        } else {
            System.out.println("Result: '" + originalInput + "' is NOT a palindrome.");
        }

        scanner.close();
    }
}