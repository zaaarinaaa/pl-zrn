import java.io.*;

public class N {
    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int n = (int) st.nval;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            st.nextToken();
            a[i] = (int) st.nval;
        }
        st.nextToken();
        int k = (int) st.nval;

        // сдвиг вправо на k (для отрицательного K это сдвиг влево)
        k = ((k % n) + n) % n;

        reverse(a, 0, n - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(' ');
            sb.append(a[i]);
        }
        System.out.println(sb);
    }
}