import java.util.Scanner;

public class maxinarray {
    public static int maxInArray(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];

        }
        int max = maxInArray(arr,idx+1);
        int me = arr[idx];
        if(me>max){
            return me;
        }
        return max;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr []= new int[n];
        for(int i=0;i<n;i++){
            arr[i] =scn.nextInt();
        }
        int ans =maxInArray(arr, 0);
        System.out.println(ans);
    }
    
}
