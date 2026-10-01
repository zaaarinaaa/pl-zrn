import java.util.Scanner;

class TaskM13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long t = a;
        a = b;
        b = t;
        System.out.println(a + " " + b);
    }
}