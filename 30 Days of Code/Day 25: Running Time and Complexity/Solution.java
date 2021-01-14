import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
        
        while(T-->0){
            int n=sc.nextInt();
            boolean c =true;
            
            if(n==2){
                c=true;
                }
                else if(n==1 || n%2==0) c=false;

            
            for(int i=3;i<=Math.sqrt(n);i+=2){
                if(n%i==0){
                     c=false;
                     break;
                     }
            }
            
            if(c) 
             System.out.println("Prime");
             else System.out.println("Not prime");
            
        } 
        
    }
}
