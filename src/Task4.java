import java.util.Scanner;

public class Task4 {

    public static void printMatrix(int n, int m) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int m = scanner.nextInt();
                if (n > 0 && m > 0) {
                    printMatrix(n, m);
                }
            }
        }
    }
}
