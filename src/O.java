import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int len = n;
        int destroyed = 0;
        boolean found = true;
        while (found) {
            found = false;
            int i = 0;
            while (i < len) {
                int j = i;
                while (j < len && a[j] == a[i]) {
                    j++;
                }
                int runLength = j - i;
                if (runLength >= 3) {
                    // удаляем цепочку, сдвигая остаток влево
                    int shift = runLength;
                    for (int k = j; k < len; k++) {
                        a[k - shift] = a[k];
                    }
                    len -= shift;
                    destroyed += shift;
                    found = true;
                    break;
                }
                i = j;
            }
        }
        System.out.println(destroyed);
    }
}