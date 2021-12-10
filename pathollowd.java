
import java.util.Scanner;

public class pathollowd {
    public static void pattern5(int n) {
        int nsp = 1, nst = (n+1)/2;

        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (r <= n / 2) {

                nst -= 1;
                nsp += 2;
            } else {
                nst += 1;
                nsp -= 2;
            }
            System.out.println();

        }

    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern5(n);
    }

}
