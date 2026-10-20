public class Task4_9 {

    static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}