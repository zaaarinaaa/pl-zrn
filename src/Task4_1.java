import java.util.Scanner;

public class Task4_1 {

    static void printStrip(int n, char symbol) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(symbol);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printStrip(n, '#');
    }
}