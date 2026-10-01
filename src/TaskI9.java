import java.util.Scanner;

class TaskI9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n / 100 + n / 10 % 10 + n % 10);
    }
}