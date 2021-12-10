import java.util.Scanner;

public class pat12 {
    public static void pattern12(int n){
        int nst =1,a=0,b=1;
        for(int r=1;r<=n;r++){
            for(int cst=1;cst<=nst;cst++){
                System.out.println(a + "\t");

                int sum =a+b;
                a =b;
                b = sum;
            }
            nst++;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern12(n);
    }
    
}
