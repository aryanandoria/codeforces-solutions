import java.util.*;
 
public class solution1 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr =  new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int score = 0;
            for(int i = 0;i<n;i++){
                if(arr[i] == 0){
                    score += 1;
                }
                else{
                    score+=arr[i];
                }
            }
            System.out.println(score);
        }
        sc.close();
    }
}