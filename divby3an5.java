import java.util.Scanner;

public class divby3an5 {
    public static boolean divide(int n) {

        if (n % 3 == 0 && n % 5 == 0) {
            return true;

        } else {
            return false;

        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean ans = divide(n);
        System.out.println(ans);
    }

}
