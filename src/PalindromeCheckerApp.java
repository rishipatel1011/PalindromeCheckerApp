import java.util.Scanner;


public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Final Palindrome Checker (Professional Edition) ---");

        while (true) {
            System.out.println("\nSelect Mode:");
            System.out.println("1. Case-Insensitive (e.g., 'Madam' = Yes)");
            System.out.println("2. Case-Sensitive (e.g., 'Madam' = No)");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            String choice = scanner.nextLine();

            if (choice.equals("3")) break;

            System.out.print("Enter text to check: ");
            String input = scanner.nextLine();

            boolean result = (choice.equals("1")) ?
                    isPalindrome(input, false) :
                    isPalindrome(input, true);

            if (result) {
                System.out.println(">>> Success: It is a palindrome.");
            } else {
                System.out.println(">>> Result: It is NOT a palindrome.");
            }
        }
        System.out.println("System Shutdown. Goodbye!");
        scanner.close();
    }

    public static boolean isPalindrome(String input, boolean caseSensitive) {
        if (input == null || input.isEmpty()) return false;


        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "");

        if (!caseSensitive) {
            cleaned = cleaned.toLowerCase();
        }

        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}