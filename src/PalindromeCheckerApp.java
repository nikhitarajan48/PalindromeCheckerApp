public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        // Application details
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Version: 1.0");

        System.out.println("\nApplication started successfully.");
        System.out.println("Proceeding to next use case...");

        //Use Case 2
        String input = "madam";

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}

