public class fibonacci {

    public static void fibo(int count){
        int a =0;
        int b=1;
      
        System.out.println(a +"   "+b);
        for(int i=2;i<=count;i++){
            int c=(a+b);
            System.out.println(c);
            a=b;
            b=c;

        }

    }
    public static void main(String args[]){
        fibo(15);
    }


    
}
