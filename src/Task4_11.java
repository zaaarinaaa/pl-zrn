import java.util.Scanner;

public class Task4_11 {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static long lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (long) a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("LCM = " + lcm(a, b));
    }
}