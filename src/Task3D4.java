import java.util.Scanner;

public class Task3D4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int d = sc.nextInt();

        int count = 0;
        while (x > 0) {
            if (x % 10 == d) {
                count++;
            }
            x /= 10;
        }
        System.out.println(count);
    }
}