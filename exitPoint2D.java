import java.util.Scanner;

public class exitPoint2D {
    public static Scanner scn = new Scanner(System.in);

    public static void exitPoint(int[][] arr) {
        int dir = 0;
        int i = 0;
        int j = 0;
        int n = arr.length;
        int m = arr[0].length;
        while (true) {
            dir += arr[i][j];
            dir %= 4;
            if (dir == 0)
            {
                j++;

            }
             else if (dir == 1)
            {
                i++;

            }
            else if(dir==2)
            {
                j--;

            }
            else{
                i--;

            }
            if(i<0 || j<0 ||i>=n ||j>=m){
                break;
            }
        }

        if(i<0){
            i++;
        }
        else if(j<0){
            j++;
        }
        else if(i>=n){
            i--;
        }
        else if(j>=m){
            j--;
        }
        System.out.println(i);
        System.out.println(j);
        

    }

    public static void main(String args[]) {
        int n = scn.nextInt();
        int m = scn.nextInt();

        // taking input in 2d

        int[][] arr = new int[n][m]; // declaration of array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        exitPoint(arr);

    }
}
