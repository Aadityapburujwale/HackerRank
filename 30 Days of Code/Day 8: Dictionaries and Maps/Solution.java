//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,String> hashmap = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
           
            hashmap.put(name,Integer.toString(phone));  
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            
            if(hashmap.containsKey(s)){
                System.out.println(s+"="+hashmap.get(s));
            }else
            System.out.println("Not found");    
        }
        in.close();
    }
}
