public class binarysearch {
    public static int binarySearch(int [] arr,int x){

        int li =0;
        int ri =arr.length - 1;
        while(li<=ri){
            int mid = li + ri /2;

            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid] > x){
                ri = mid -1;
            }
            else if(arr[mid]< x){
                li= mid+1;

            }

        }
        return -1;
    }

    public static void main(String args[]){
        int [] arr = {2,4,6,8,10,12,14,16,18,20,22,24};
        int x=20;
        int ans = binarySearch(arr, x);
        System.out.println(ans);

    }
    
}
