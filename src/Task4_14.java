import java.util.Scanner;

public class Task4_14 {

    static String transformDigits(String n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            if (digit % 2 == 0) {
                digit++;
            } else {
                digit--;
            }
            sb.append(digit);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        System.out.println(transformDigits(n));
    }
}