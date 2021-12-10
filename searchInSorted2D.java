import java.util.Scanner;

public class searchInSorted2D {
    public static void searchIn2D(int[][] arr, int x) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (arr[i][j] == x) {
                System.out.println(i);
                System.out.println(j);

                return;

            } else if (arr[i][j] > x) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("Not Found");

    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        searchIn2D(arr, x);
    }

}
