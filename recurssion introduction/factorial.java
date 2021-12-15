import java.util.Scanner;

public class factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int recAns =factorial(n-1);
        int myAns = n * recAns;
        return myAns;

    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans =factorial(n);
        System.out.println(ans);
    }
    
}
