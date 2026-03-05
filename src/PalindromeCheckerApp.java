import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("--- Palindrome Checker (Continuous Mode) ---");


        while (true) {
            System.out.print("\nEnter text/number to check (or type 'exit' to quit): ");
            String input = scanner.nextLine();


            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the Palindrome Checker. Goodbye!");
                break;
            }

            if (isPalindrome(input)) {
                System.out.println("Success: '" + input + "' is a palindrome.");
            } else {
                System.out.println("Result: '" + input + "' is NOT a palindrome.");
            }
        }
        scanner.close();
    }

    /**
     * Reusable logic from UC9/UC10
     */
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) return false;
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}