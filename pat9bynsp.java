import java.util.Scanner;

public class pat9bynsp {
    public static void pattern9bynsp(int n){
        int nsp1=0, nsp2=n-2;
        for(int r =1;r<=n;r++){

            for(int csp=1;csp<=nsp1;csp++){
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int csp=1;csp<=nsp2;csp++){
                System.out.print("\t");
            }
            if(r!=(n+1)/2){
              System.out.print("*\t");
            }

            if(r<=n/2){
                nsp1+=1;
                nsp2-=2;
            }else{
                nsp1-=1;
                nsp2+=2;
            }
            System.out.println();

         
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern9bynsp(n);

    }
    
}
