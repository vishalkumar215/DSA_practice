import java.util.Scanner;

public class pat13 {

    public static void pattern13(int n) {
        for (int r = 0; r < n; r++) {
            int count = 1;
            for (int cst = 0; cst <= r; cst++) {
                System.out.print(count + "\t");
                count = (count * (r - cst)) / (cst + 1);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern13(n);
    }

}
