import java.util.Scanner;
public class Task8 {
    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 0) {
                System.out.println("Binary = " + decimalToBinary(n));
            }
        }
    }
}
