import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker using Queue and Stack");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters
        for (char c : input.toCharArray()) {
            queue.add(c);     // enqueue
            stack.push(c);    // push
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            char q = queue.remove();   // dequeue
            char s = stack.pop();      // pop

            if (q != s) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is NOT a Palindrome");

        sc.close();
    }
}