import java.util.Scanner;

class TaskL12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n %= 86400;
        long h = n / 3600;
        long m = n / 60 % 60;
        long s = n % 60;
        System.out.printf("%d:%02d:%02d%n", h, m, s);
    }
}