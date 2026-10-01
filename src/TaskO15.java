import java.util.Scanner;

class TaskO15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long total = (a * 100 + b) * n;
        System.out.println(total / 100 + " " + total % 100);
    }
}