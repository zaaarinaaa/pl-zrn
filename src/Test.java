import java.util.Scanner;

public class Test {

    static int divisors(int n) {
        int count = 0;
        for (int i = 1; (long) i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(divisors(n));
    }
}