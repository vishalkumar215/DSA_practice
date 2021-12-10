import java.util.Scanner;

public class rotateby902D {

    public static void transpose(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
    }

    public static void reverse(int [][] arr){
        int n = arr.length;
        for(int i = 0; i<n ; i++){
            int li = 0;
            int ri = n-1;
            
            while(li<=ri){
                int tmp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = tmp;
                
                li++;
                ri--;
            }
            
        }
    }

    // for display
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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
        transpose(arr);
        reverse(arr);
        display(arr);
    }

}
