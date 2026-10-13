import java.util.Scanner;

public class Task3O15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            if (sc.nextLong() == 0) {
                hasZero = true;
            }
        }
        System.out.println(hasZero ? "YES" : "NO");
    }
}