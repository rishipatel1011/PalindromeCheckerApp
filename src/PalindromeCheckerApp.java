import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Refactored Palindrome Checker (Methods) ---");
        System.out.print("Enter text: ");

        String input = scanner.nextLine();


        if (isPalindrome(input)) {
            System.out.println("Success: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }


    public static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }


        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}