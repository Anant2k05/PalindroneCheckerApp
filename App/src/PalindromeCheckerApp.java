import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        return str.equals(rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("==================================");
        System.out.println("   Palindrome Checker Application ");
        System.out.println("   Version 1.0");
        System.out.println("==================================");

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str = sc.nextLine();

                    if (isPalindrome(str)) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not Palindrome");
                    }
                    break;

                case 2:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 2);

        System.out.println("Program terminated successfully.");
        sc.close();
    }
}