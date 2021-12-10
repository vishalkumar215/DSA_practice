import java.util.Scanner;

public class spanofarray{
    public static int maximum(int[] arr) {
        int n = arr.length, maxEle = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxEle = Math.max(maxEle, arr[i]);
        }

        return maxEle;
    }
    public static int minimum(int[] arr) {
        int n = arr.length, minEle = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            minEle = Math.min(minEle, arr[i]);
        }

        return minEle;
    }
    public static void main(String args[])throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        
        for(int i =0;i<arr.length;i++){
            arr [i]=scn.nextInt();
        }
        //max 
        //min
        //span = max-min
        int max = maximum(arr);
        int min =minimum(arr);
        int span= max-min;
        System.out.println(span);

      


    }








}