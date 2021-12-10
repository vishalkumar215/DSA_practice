import java.util.Scanner;

public class pat9 {

    public static void pattern0(int n){
        for(int row=1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                if(row+col ==n+1 || row==col){
                    System.out.print("*\t");

                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern0(n);
    }
    
}
