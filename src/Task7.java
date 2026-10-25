import java.util.Scanner;

public class Task7 {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n >= 0) {
                    System.out.println("Factorial = " + factorial(n));
                }
            }
        }
    }
