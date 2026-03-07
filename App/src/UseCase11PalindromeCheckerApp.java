import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
<<<<<<< HEAD
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
=======

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

>>>>>>> c6bb771e89e46a05f88af0e2db54bea077b9b7cc
            start++;
            end--;
        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Object-Oriented Palindrome Checker");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result)
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is NOT a Palindrome");

        sc.close();
    }
}