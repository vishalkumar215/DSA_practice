import java.util.Scanner;

public class brokenEconomy {
    public static void brokenEconomypep(int [] arr, int x){
        int li = 0;
        int ri = arr.length-1;
        int ceil =0;
        int floor =0;
        while(li<=ri){
            int mid = li+ri/2;
            if(arr[mid]==x){
                ceil=arr[mid];
                floor = arr[mid];
                break;

            }
            else if(arr[mid]>x){
                ri = mid-1;
                ceil=arr[mid];

            }else{
                li = mid+1;
                floor =arr[mid];

            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    } 
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new  int[n];
        for (int i = 0; i < n; i++) {
          a[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        brokenEconomypep(a,d);
    
      }
    
}
