import java.util.Scanner;

public class primetilln{
    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int lo = scn.nextInt();
        int hi = scn.nextInt();
        for (int num = lo; num <= hi; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }

        }

    }
}
