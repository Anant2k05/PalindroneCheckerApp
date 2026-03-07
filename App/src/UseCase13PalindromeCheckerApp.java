import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Simple iterative method
    public static boolean iterativePalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    // Stack based method
    public static boolean stackPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Performance Comparison");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        // Iterative timing
        long start1 = System.nanoTime();
        boolean result1 = iterativePalindrome(input);
        long end1 = System.nanoTime();

        // Stack timing
        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(input);
        long end2 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Iterative Method: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        sc.close();
    }
}