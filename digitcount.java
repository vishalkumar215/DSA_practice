import java.util.Scanner;

public class digitcount {
    public static int numOfDigit(int n) {
        int d = 0;
        while (n != 0) {
            n = (n / 10);
            d++;

        }
        return d;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans =numOfDigit(n);
        System.out.println(ans);
    

    }

}
