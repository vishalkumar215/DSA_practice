public class pattern1 {

    public static void pattern(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=2*n;j++){
                if(j<=n){
                    System.out.println("-");

                }else{
                    System.out.println("+");
                }
            }
        }
    }
    
}
