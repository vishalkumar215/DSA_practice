import java.util.Scanner;

public class pat17 {
    public static void pattern17(int n){
        int nsp = n/2, nst =1;
        for(int r =1;r<=n;r++){
            if(r!=(n+1)/2){
              for(int csp=1;csp<=nsp;csp++){
                System.out.print("\t");
              }
            }else{
                for(int csp=1;csp<=nsp;csp++){
                    System.out.print("*\t");
                
                }
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*\t");
            }
            if(r<=n/2){
                nst+=1;

            }
            else{
                nst-=1;
            }
            System.out.println();
        }
        

    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern17(n);
    }
    
}
