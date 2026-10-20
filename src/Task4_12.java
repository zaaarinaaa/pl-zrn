import java.util.Scanner;

public class Task4_12 {

    static long reverseNumber(long n) {
        boolean negative = n < 0;
        if (negative) {
            n = -n;
        }
        long result = 0;
        while (n > 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }
        return negative ? -result : result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(reverseNumber(n));
    }
}