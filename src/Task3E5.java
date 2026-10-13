import java.util.Scanner;

public class Task3E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        long sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println(sum);
    }
}