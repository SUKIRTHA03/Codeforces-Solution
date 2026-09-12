import java.util.*;
public class BSwapAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            int zero = 0;
            int one = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0')
                    zero++;
                else
                    one++;
            }

            int ans = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    if (one > 0)
                        one--;
                    else
                        break;
                } else {
                    if (zero > 0)
                        zero--;
                    else
                        break;
                }
            }

            System.out.println(zero + one);
        }
    }
}