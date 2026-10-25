import java.util.Scanner;

public class Task6 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                int count = 0;
                for (int i = a; i <= b; i++) {
                    if (isPrime(i)) {
                        count++;
                    }
                }
                System.out.println("Prime Count = " + count);
            }
        }
    }
}
