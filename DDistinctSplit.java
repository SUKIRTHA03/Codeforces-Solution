import java.util.*;

public class DDistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] left = new int[n];
            int[] right = new int[n];

            boolean[] seen = new boolean[26];
            int count = 0;

            for (int i = 0; i < n; i++) {
                int x = s.charAt(i) - 'a';

                if (!seen[x]) {
                    seen[x] = true;
                    count++;
                }

                left[i] = count;
            }

            Arrays.fill(seen, false);
            count = 0;

            for (int i = n - 1; i >= 0; i--) {
                int x = s.charAt(i) - 'a';

                if (!seen[x]) {
                    seen[x] = true;
                    count++;
                }

                right[i] = count;
            }

            int ans = 0;

            for (int i = 0; i < n - 1; i++) {
                ans = Math.max(ans, left[i] + right[i + 1]);
            }

            System.out.println(ans);
        }
    }
}

