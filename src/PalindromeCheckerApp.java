import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        // Application details
        System.out.println("--- Use Case 1 ---");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Version: 1.0");

        System.out.println("\nApplication started successfully.");
        System.out.println("Proceeding to next use case...");

        //Use Case 2
        System.out.println("--- Use Case 2 ---");
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

        // Use Case 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Use Case 3 ---");

        System.out.print("\nEnter a string to check: ");
        String userInput = scanner.nextLine();

        String reversed = "";

        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed += userInput.charAt(i);
        }

        if (userInput.equalsIgnoreCase(reversed)) {
            System.out.println("The string \"" + userInput + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + userInput + "\" is NOT a palindrome.");
        }
        // Use Case 4
        System.out.println("\n--- Use Case 4 ---");

        System.out.print("Input : ");
        String input4 = scanner.nextLine();

        char[] chars = input4.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome4 = true;

        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome4 = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Is Palindrome? : " + isPalindrome4);

        scanner.close();
    }
}


