/*
For question go the the below link
https://www.hackerrank.com/challenges/java-loops/problem

*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int arr[] = new int[n];
            arr[0] = a + b; // The term a + 2^0 * b is constant. Only the 2^i*b should be added to it.
            int temp = arr[0];
                for(int k=1;k<n;k++){
                    arr[k] = (int) (temp + Math.pow(2,k)*b);
                    temp = arr[k]; // store the previous term in the series in a temporary variable and keep adding 2^i*b to it.  
                }
            
            // printing the series
        for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
        }
        System.out.println();    
        t--;  
    }
        in.close();
    }
}
