import java.util.Scanner;

public class reverseofarray {
    public static void reverse(int[] arr){
        int i =0;
        int j =arr.length - 1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--; 
        }

    }
    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[i]=temp;

    }



















    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        reverseofarray(arr);
    }
    
}
