import java.util.Scanner;
public class table {
    public static Scanner scn = new Scanner(System.in);

    public static void printTable(int num){
        for(int i =1;i<=10;i++){
            System.out.println(num + "X"+ i +"=" +(num*i));
        }
    }
    public static void tableInRange(){
        int a = scn.nextInt();
        int b = scn.nextInt();
        for(int i=a; i<=b;i++){
            printTable(i);
            System.out.println("==============================");

        }

    }
    public static void main(String args []){
        tableInRange();
    }
    
}
