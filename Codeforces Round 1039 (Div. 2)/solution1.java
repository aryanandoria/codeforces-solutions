import java.util.*;
 
public class solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int cnt = 0;
            Arrays.sort(arr);
            for(int i = n-1;i>=0;i--){
                if(arr[i] >c){
                    cnt++;
                }
                else{
                    multiplytwo(i,arr);
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
    public static void multiplytwo(int i,int[]arr){
        for(int j = i;j>=0;j--){
            arr[j] = arr[j] *2;
        }
    }
}