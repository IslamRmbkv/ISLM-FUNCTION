import java.util.Scanner;
public class Task9 {
    public static String checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(checkEvenOdd(n));
        }
    }
}
