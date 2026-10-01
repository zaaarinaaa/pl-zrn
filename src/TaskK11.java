import java.util.Scanner;

class TaskK11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n %= 1440;
        System.out.println(n / 60 + " " + n % 60);
    }
}