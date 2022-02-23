import java.util.Scanner;

public class reversenum {

    public static int reverseDigit(int num ){
        
        while(num!=0){
             int dig = num % 10;
            num = num/10;
             System.out.println(dig);
            
        }
    
        
    }
    public static void main(String args []){
        Scanner scn =new Scanner(System.in);
        int num = scn.nextInt();
       int ans = reverseDigit(num);
       System.out.println(ans);
    
    
    }
    
}
