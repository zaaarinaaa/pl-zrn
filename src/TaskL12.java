import java.util.Scanner;

public class TaskL12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long m = sc.nextLong();
        long n = sc.nextLong();
        long cycles;
        if (n == 0) {
            cycles = 0;
        } else if (n <= k) {
            cycles = 2;
        } else {
            cycles = (2 * n + k - 1) / k;
        }
        System.out.println(cycles * m);
    }
}