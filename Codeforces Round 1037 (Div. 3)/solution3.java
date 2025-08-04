import java.util.*;
 
public class solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt(); 
            int[] h = new int[n];
 
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }
 
            int hk = h[k - 1]; 
            int hmax = Arrays.stream(h).max().getAsInt();
 
            if (hk == hmax) {
                System.out.println("YES");
                continue;
            }
 
            Set<Integer> set = new TreeSet<>();
            for (int height : h) {
                set.add(height);
            }
 
            List<Integer> v = new ArrayList<>(set);
            int pos = Collections.binarySearch(v, hk);
            if (pos < 0) pos = -pos - 1;
 
            boolean ok = true;
            for (int i = pos; i + 1 < v.size(); i++) {
                if (v.get(i + 1) - v.get(i) > hk) {
                    ok = false;
                    break;
                }
            }
 
            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}