
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Predefined string for validation
        String input = "radar";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            reversed = reversed + input.charAt(i);
        }


        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}