import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker (Numbers & Strings) ---");
        System.out.print("Enter a word or a number: ");

        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Success: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Enhanced palindrome logic for numbers and text
     * @param input The input string or number to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }


        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}