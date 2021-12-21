import java.util.Scanner;

public class lastindex1 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int ans = lastIndex(arr,n-1,x);
        System.out.println(ans);
        

    }

    public static int lastIndex(int[] arr, int idx, int x){
        
        if(idx<0){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        return lastIndex(arr,idx-1,x);
    }

    
}

    

