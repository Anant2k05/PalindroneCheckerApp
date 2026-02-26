import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }

            if (str.equals(rev)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }

            System.out.print("Do you want to check another? (y/n): ");
            choice = sc.next().charAt(0);
            sc.nextLine(); // consume newline

        } while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("Program Ended");
    }
}