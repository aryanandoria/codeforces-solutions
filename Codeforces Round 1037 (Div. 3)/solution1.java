import java.util.*;
public class solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int x = n;
            while(x!=0){
                int num = x%10;
                list.add(num);
                x /=10;
            }
            int min = Integer.MAX_VALUE;
            for(int temp :list){
                if(temp<min){
                    min = temp;
                }
            }
            System.out.println(min);
        }
        sc.close();
    }
}