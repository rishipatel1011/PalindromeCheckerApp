import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Advanced Palindrome Checker (reverse() Method) ---");
        System.out.print("Enter text: ");

        String input = scanner.nextLine();


        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        String reversed = new StringBuilder(cleaned).reverse().toString();


        if (!cleaned.isEmpty() && cleaned.equals(reversed)) {
            System.out.println("Success: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }
}