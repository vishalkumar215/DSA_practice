import java.util.Scanner;

public class pat8 {
    public static void pattern8(int row) {
        for (int r = 1; r <= row; r++) {
            for(int c=1;c<=row;c++){
                if(c+r==6){
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
        pattern8(n);

    }
    
}
