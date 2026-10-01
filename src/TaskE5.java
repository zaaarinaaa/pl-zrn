import java.util.Scanner;

class TaskE5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long v = sc.nextLong();
        long t = sc.nextLong();
        long pos = ((v * t) % 109 + 109) % 109;
        System.out.println(pos);
    }
}