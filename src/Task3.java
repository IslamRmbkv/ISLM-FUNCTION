import java.util.Scanner;

public class Task3 {

    public static void printInvertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                printInvertedPyramid(n);
            }
        }
    }
}