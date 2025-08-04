import java.util.*;
public class solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] a = new int[n];
        int sum = 0, cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            if (a[i] == 0) cnt0++;
            else if (a[i] == 1) cnt1++;
            else if (a[i] == 2) cnt2++;
        }

        int T = s - sum;

        if (T < 0 || T == 1) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < cnt0; i++) result.add(0);
            for (int i = 0; i < cnt2; i++) result.add(2);
            for (int i = 0; i < cnt1; i++) result.add(1);

            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i));
                if (i != result.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }
        }
        sc.close();
    }
}
