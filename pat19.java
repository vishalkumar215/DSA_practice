public class pat19 {
    public static void pattern19(int n){
        int nst=n/2 ,nsp =1;
        for(int r =1;r<=n;r++){
            for(int cst =1;cst<=nst;cst++){
                System.out.print("*\t");
            }
            for(int csp =1;csp<=nsp;csp++){
                System.out.print("\t");
            }
            System.out.println("*\t");
            
        

    }
}
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern17(n);
    }
        
    
    

