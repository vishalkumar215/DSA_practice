import java.util.Scanner;

public class spiraldisplay {
    public static void spiralDisplay(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int minrow = 0;
        int maxrow = n - 1;
        int mincol = 0;
        int maxcol = m - 1;
        int count = 0;
        int total = m * n;
        while (count < total) {
            for (int i = minrow; i <= maxrow && count <total; i++) {
                System.out.println(arr[i][mincol]);
                count++;

            }
            mincol++;

            for (int i = mincol; i <= maxcol && count <total; i++) {
                System.out.println(arr[maxrow][i]);
                count++;

            }
            maxrow--;
            for (int i = maxrow; i >= minrow && count <total; i--) {
                System.out.println(arr[i][maxcol]);
                count++;

            }

           

            maxcol--;
            
            for (int i = maxcol; i >= mincol && count <total; i--) {
                System.out.println(arr[minrow][i]);
                count++;

            }
            minrow++;

        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        spiralDisplay(arr);

    }

}
