import java.util.Scanner;

class TaskN14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minutes = 9 * 60 + n * 45 + (n - 1) / 2 * 20 + (n - 1) % 2 * 5;
        System.out.println(minutes / 60 + " " + minutes % 60);
    }
}