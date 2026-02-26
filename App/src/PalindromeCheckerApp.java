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

        do {
            System.out.println("\n--- Palindrome Checker Menu ---");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

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

        sc.close();
    }
}