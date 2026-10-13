import java.util.Scanner;

public class Task3A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        StringBuilder sb = new StringBuilder();
        for (long i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sb.append(i).append(' ');
            }
        }
        System.out.println(sb);
    }
}