import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        long prev = sc.nextLong();
        for (int i = 1; i < n; i++) {
            long x = sc.nextLong();
            if ((x > 0) == (prev > 0)) {
                found = true;
            }
            prev = x;
        }
        System.out.println(found ? "YES" : "NO");
    }
}