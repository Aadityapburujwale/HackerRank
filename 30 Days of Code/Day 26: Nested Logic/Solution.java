import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int dayR = sc.nextInt();
        int monthR = sc.nextInt();
        int yearR = sc.nextInt();
        
        int dayD = sc.nextInt();
        int monthD = sc.nextInt();
        int yearD = sc.nextInt();
        
        int fine=0;
        
        
        if(yearR<=yearD){
            
            if(monthR<=monthD){
                
                if(dayR<=dayD){
                    fine=0;
                }else {
                    fine=(dayR-dayD)*15;
                }
                
            }else if(monthR>monthD && yearR==yearD){
                fine=(monthR-monthD)*500;
            }
            
        }else {
            fine=10000;
        }
        
        System.out.println(fine);
        
    }
}
