import java.util.Scanner;
public class Task10 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                System.out.println("GCD = " + gcd(a, b));
            }
        }
    }
}
