import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binary = Integer.toBinaryString(n);

int temp=0; 
int max = 0;

for(int i=0;i<binary.length();i++){
    
    if(binary.charAt(i)=='1'){ 
        temp++;
        if(temp>max) max=temp;   
    }else temp=0;
    
}
System.out.print(max);

        scanner.close();
    }
}
