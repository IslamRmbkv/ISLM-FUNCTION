import java.util.Scanner;
public class Task15 {
    public static String checkPalindrome(int n) {
        if (n < 0) {
            return "Not Palindrome";
        }
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        if (original == reversed) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(checkPalindrome(n));
        }
    }
}
