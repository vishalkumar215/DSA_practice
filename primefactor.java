import java.util.Scanner;

public class primefactor {

    public static void primeFactor(int num){
        for(int pn=2;pn*pn<=num;pn++){
            while(num%pn==0){
                System.out.println(pn +" ");
                num=num/pn;
            }
        }
        if(num!=1){
            System.out.println(num);
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        primeFactor(n);
    }
    
}
