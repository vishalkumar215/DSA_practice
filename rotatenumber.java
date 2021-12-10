import java.util.Scanner;

public class rotatenumber {

    public static int numOfDigit(int n) {
        int d = 0;
        while (n != 0) {
            n = (n / 10);
            d++;

        }
        return d;
    }
    
    public static int rotateNum(int num,int k){
     int totalDigit =numOfDigit(num);
     int res = 0;
     for(int i =1; i<=k;i++){
         int digit = num %10;
         num = num / 10;
         if(digit == 0){
             
         }
         res = num + (digit *(int)Math.pow(10, totalDigit - 1));
         num = res;
         
         
     }
     return res;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int ans = rotateNum(n, k);
        System.out.println(ans);
    }
}
