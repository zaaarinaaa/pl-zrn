import java.util.Scanner;

public class TaskK11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        boolean ok = false;
        for (int y = 0; 5 * y <= k; y++) {
            if ((k - 5 * y) % 3 == 0) {
                ok = true;
                break;
            }
        }
        System.out.println(ok ? "YES" : "NO");
    }
}