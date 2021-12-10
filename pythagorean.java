import java.util.Scanner;

public class pythagorean {
    public static boolean pythagorus(int a, int b,int c){
        if(a*a == b*b +c*c){
            return true;
        }else if(b*b == a*a +c*c){
            return true;
        }
        else if(c*c == b*b +a*a){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
       boolean ans = pythagorus(a, b, c);
       System.out.println(ans);
       



    }
    
}
