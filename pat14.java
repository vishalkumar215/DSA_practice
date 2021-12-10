import java.util.Scanner;

public class pat14 {
    
    public static void pattern14(int x){
        for(int i =1;i<=10;i++){
            System.out.println(x +"*"+ i +"=" + i*x);
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern14(n);
    }
}
