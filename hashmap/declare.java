import java.util.HashMap;
import java.util.Scanner;


public class declare{


    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("india", 428);
        hm.put("china",225);
        hm.put("us",265);
        hm.put("pak",625);
        hm.put("Dubai",225);
        hm.put("hongkong",725);
        hm.put("nepal",825);
        hm.put("india", 125);
        System.out.println(hm.get("india"));
        System.out.println(hm.keySet());
        System.out.println(hm.containsKey("india"));
        System.out.println(hm);
        for(String key:hm.keySet()){
            System.out.println(key);
        }
        



        
    
    
    }
}