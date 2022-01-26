import java.util.Scanner;
import java.util.*;

public class fibonacci {
    // public static int fiboR( int n ){
    //     if(n <= 1){
    //         return n;
    //     }
    //     int n1 = fiboR( n-1);
    //     int n2 = fiboR( n-2);
    //     int num = n1 + n2;
        
    //     return num;
        
        
        
        
    // }
    // public static int fiboM(int n, int[] dp) {
    //     if (n <= 1) {
    //         return dp[n] = n;
    //     }
    //     if (dp[n] != -1) {
    //         return dp[n];
    //     }
    //     int n1 = fiboM(n - 1, dp);
    //     int n2 = fiboM(n - 2, dp);

    //     return dp[n] = n1 + n2;

    // }
    public static int fiboT( int N , int [] dp ){
        for(int n =0 ; n < dp.length ; n++){
        if(n <= 1){
            dp[n] = n;
            continue;
        }
        
        int n1 = dp[n-1];
        int n2 = dp[n-2];
        
        
         dp[n] =n1 +n2;
        
        
        
        }
        return dp[N];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[] = new int[n + 1];
        Arrays.fill(dp,-1);
        // int  ans = fiboR(n);
        // int ans = fiboM(n, dp);
        int ans = fiboT(n, dp);
        System.out.println(ans);

    }

}
