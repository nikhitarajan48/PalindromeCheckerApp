import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        // Application details
        System.out.println("--- Use Case 1 ---");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Version:1.0");

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

        // Use Case 5 - Stack based
        System.out.println("\n--- Use Case 5 ---");
        System.out.print("Input : ");
        String input5 = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char c : input5.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome5 = true;
        for (char c : input5.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome5 = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome5);


        // Use Case 6 (Queue + Stack)
        System.out.println("\n--- Use Case 6 ---");

        System.out.print("Input : ");
        String input6 = scanner.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack6 = new Stack<>();

        for (char c : input6.toCharArray()) {
            queue.add(c);
            stack6.push(c);
        }

        boolean isPalindrome6 = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack6.pop()) {
                isPalindrome6 = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome6);

        // Use Case 7 (Deque)
        System.out.println("\n--- Use Case 7 ---");

        System.out.print("Input : ");
        String input7 = scanner.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input7.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome7 = true;

        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome7 = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome7);

        // Use Case 8 (LinkedList)
        System.out.println("\n--- Use Case 8 ---");

        System.out.print("Input : ");
        String input8 = scanner.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        for (char c : input8.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome8 = true;

        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome8 = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome8);
        // UC9 - Recursion Method

        System.out.println("\n--- UC9 : Recursion Method ---");

        System.out.print("Input : ");
        String input9 = scanner.nextLine();

        boolean isPalindrome9 = checkPalindrome(input9, 0, input9.length() - 1);

        System.out.println("Is Palindrome? : " + isPalindrome9);


        // UC10 - Normalized Palindrome
        System.out.println("\n--- UC10 : Ignore Spaces & Symbols ---");

        System.out.print("Input : ");
        String input10 = scanner.nextLine();

        String normalized = input10.replaceAll("\\W", "").toLowerCase();

        boolean isPalindrome10 = true;

        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome10 = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome10);

        // Use Case 11 - Service Class
        System.out.println("\n--- UC11 : Service Class ---");

        System.out.print("Input : ");
        String input11 = scanner.nextLine();

        PalindromeService service = new PalindromeService();

        boolean isPalindrome11 = service.checkPalindrome(input11);

        System.out.println("Is Palindrome? : " + isPalindrome11);

        //Use Case 12
        // UC12 : Strategy Pattern
        System.out.println("\n--- UC12 : Strategy Pattern ---");

        System.out.print("Input : ");
        String input12 = scanner.nextLine();

        PalindromeContext context = new PalindromeContext();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();

        if (choice == 1) {
            context.setStrategy(new StackStrategy());
            System.out.println("Using Stack Strategy...");
        }
        else if (choice == 2) {
            context.setStrategy(new DequeStrategy());
            System.out.println("Using Deque Strategy...");
        }
        else {
            System.out.println("Invalid choice!");
            return;
        }

        boolean result = context.executeStrategy(input12);

        System.out.println("Is Palindrome? : " + result);

        // --- UC13 : Performance Comparison (UC3 vs UC4) ---
        System.out.println("\n--- UC13 : Performance Comparison ---");

        System.out.print("Input (Long string recommended for comparison): ");
        String input13 = scanner.nextLine();

// --- Approach 1: String Reversal ---
        long startTime1 = System.nanoTime();
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

// --- Approach 2: Two-Pointer ---
        long startTime2 = System.nanoTime();
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

// Display results
        System.out.println("\n--- Performance Results ---");
        System.out.println("String Reversal Time : " + duration1 + " ns");
        System.out.println("Two-Pointer Time     : " + duration2 + " ns");

        if (duration2 < duration1) {
            System.out.println("Result: Two-Pointer is faster by " + (duration1 - duration2) + " ns.");
        } else {
            System.out.println("Result: String Reversal was faster in this instance.");
        }

        scanner.close();
    }
    // Recursive function for UC9
    private static boolean checkPalindrome(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return checkPalindrome(s, start + 1, end - 1);
    }
}

// Service class for UC11
class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    //UC13-Recursion
    // Method from UC3 (String Reversal)
    public static boolean checkByReversal(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equalsIgnoreCase(reversed);
    }

    // Method from UC4 (Two Pointer)
    public static boolean checkByTwoPointer(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
//UC12-Recursion
// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.isPalindrome(input);
    }
}




