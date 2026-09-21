import java.util.*;

public class CQuests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            long sum = 0;
            long maxB = 0;
            long ans = 0;

            int limit = Math.min(n, k);

            for (int i = 0; i < limit; i++) {
                sum += a[i];
                maxB = Math.max(maxB, b[i]);

                long total = sum + (long)(k - i - 1) * maxB;
                ans = Math.max(ans, total);
            }

            System.out.println(ans);
        }
    }
}