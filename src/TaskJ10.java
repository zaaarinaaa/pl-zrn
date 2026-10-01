import java.util.Scanner;

class TaskJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n + 2 - n % 2);
    }
}