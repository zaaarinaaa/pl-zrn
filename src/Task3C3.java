import java.util.Scanner;

public class Task3C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        StringBuilder sb = new StringBuilder();
        for (long i = 0; i * i <= b; i++) {
            long sq = i * i;
            if (sq >= a) {
                sb.append(sq).append(' ');
            }
        }
        System.out.println(sb);
    }
}