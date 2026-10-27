import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            if (i % 2 == 0) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(x);
            }
        }
        System.out.println(sb);
    }
}