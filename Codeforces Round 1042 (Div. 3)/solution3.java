import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class solution3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
 
        while (tt-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
 
            long[] s = new long[n];
            long[] t = new long[n];
 
            for (int i = 0; i < n; i++) s[i] = sc.nextLong();
            for (int i = 0; i < n; i++) t[i] = sc.nextLong();
 
            if (k == 0) {
                Arrays.sort(s);
                Arrays.sort(t);
                if (Arrays.equals(s, t)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }
            HashMap<Long, Integer> cnt = new HashMap<>(n * 2);
 
            for (long x : s) {
                long r = x % k;
                if (r < 0) r += k;
                long nr = Math.min(r, k - r);
                cnt.put(nr, cnt.getOrDefault(nr, 0) + 1);
            }
 
            for (long x : t) {
                long r = x % k;
                if (r < 0) r += k;
                long nr = Math.min(r, k - r);
                cnt.put(nr, cnt.getOrDefault(nr, 0) - 1);
            }
 
            boolean ok = true;
            for (int val : cnt.values()) {
                if (val != 0) {
                    ok = false;
                    break;
                }
            }
 
            if (ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}
