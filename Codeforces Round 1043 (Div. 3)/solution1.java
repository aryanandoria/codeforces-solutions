import java.util.*;
 
public class solution1 {
 
    public static void solution1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine(); 
            String s1 = sc.nextLine();
 
            int m = sc.nextInt();
            sc.nextLine(); 
            String s2 = sc.nextLine();
 
            String s3 = sc.nextLine();
            int ind = 0;
            StringBuilder ans = new StringBuilder(s1);
            for(int i= 0 ;i<s3.length();i++){
                char ch = s2.charAt(ind);
                if(s3.charAt(ind) == 'D'){
                    ans.append(ch);
 
                }
                else{
                    ans.insert(0, ch);
                }
                ind++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}