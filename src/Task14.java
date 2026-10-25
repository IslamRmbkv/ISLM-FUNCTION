import java.util.Scanner;
public class Task14 {
    public static int transformDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 0;
        int place = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                digit += 1;
            } else {
                digit -= 1;
            }
            result = digit * place + result;
            place *= 10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 0) {
                System.out.println(transformDigits(n));
            }
        }
    }
}
