import java.util.Scanner;

public class Task4_4 {

    static void printMatrix(int n, int m) {
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(value++);
                if (j < m - 1) {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printMatrix(n, m);
    }
}