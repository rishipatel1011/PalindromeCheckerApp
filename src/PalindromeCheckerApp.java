import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Interactive Palindrome Checker ---");
        System.out.print("Enter the text you want to check: ");


        String input = scanner.nextLine();
        String reversed = "";


        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Display results
        System.out.println("Reversed Result: " + reversed);

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Success: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Notice: '" + input + "' is not a palindrome.");
        }

        // Close scanner to release resources
        scanner.close();
    }
}