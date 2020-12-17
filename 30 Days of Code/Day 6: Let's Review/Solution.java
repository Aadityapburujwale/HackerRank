import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String s = sc.nextLine();
            
            for(int i=0;i<s.length();i+=2){
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
            for(int i=1;i<s.length();i+=2){
                System.out.print(s.charAt(i));
            }
            System.out.println("");
        }
        sc.close();
    }
}
