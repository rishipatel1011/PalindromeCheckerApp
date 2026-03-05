import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- High-Performance Palindrome Checker ---");

        while (true) {
            System.out.print("\nEnter text (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;


            long startTime = System.nanoTime();

            boolean result = isPalindrome(input);


            long endTime = System.nanoTime();
            long duration = (endTime - startTime);

            if (result) {
                System.out.println(">>> Success: It is a palindrome.");
            } else {
                System.out.println(">>> Result: It is NOT a palindrome.");
            }


            System.out.println("Performance Log: Execution time: " + duration + " ns");
        }
        System.out.println("System Shutdown.");
        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) return false;
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}