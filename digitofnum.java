
import java.util.Scanner;

public class digitofnum {

    public static int reverseDigit(int num ){
        
        while(num>0){
            int dig = num % 10;
            num = num/10;
            System.out.println(dig);
            
        }
        return 0;
        
        
    }
    public static int digitNum(int n){
    
        int rev = reverseDigit(n);
        int result = rev %10;
        
        return result;
    }
    public static void main(String args []){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int ans = digitNum(n);
        System.out.println(ans);
    }

    
}
