import java.util.Scanner;

public class stateofwakanda2 {
    public static void sow2(int[][] a) {
        for (int gap = 0; gap < a.length; gap++) {
            for (int i = 0, j = gap; j < a.length; i++, j++) {
                System.out.println(a[i][j]);
            }
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        sow2(arr);

    }

}
