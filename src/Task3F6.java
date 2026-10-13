import java.util.Scanner;

public class Task3F6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        long rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        System.out.println(rev);
    }
}