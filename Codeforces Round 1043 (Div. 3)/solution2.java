import java.util.*;

public class solution2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            List<Long> results = new ArrayList<>();
            for (int k = 1; k <= 18; k++) { 
                long den = (long) Math.pow(10, k) + 1;
                if (den > n) break;
                if (n % den == 0) {
                    long x = n / den;
                    results.add(x);
                }
            }
 
            if (results.isEmpty()) {
                System.out.println(0);
            } else {
                Collections.sort(results);
                System.out.println(results.size());
                for (int i = 0; i < results.size(); i++) {
                    System.out.print(results.get(i));
                    if (i < results.size() - 1) System.out.print(" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
