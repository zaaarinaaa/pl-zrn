import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        long prev = sc.nextLong();
        for (int i = 1; i < n; i++) {
            long x = sc.nextLong();
            if (x > prev) {
                count++;
            }
            prev = x;
        }
        System.out.println(count);
    }
}