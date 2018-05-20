/*
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. 
Given a number, n, determine and print whether it's PRime or Not Prime.

Input
The first line contains an integer, T, the number of test cases. 
Each of the T subsequent lines contains an integer, n, to be tested for primality

Constraints
1<=T<=30
1<=n<=2*10^9

Output
For each test case, print whether n is Prime or Not Prime on a new line.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            boolean isPrime=true;
            int n = sc.nextInt();
            if(n==1)
                System.out.println("Not prime");
            else{
            for(int i=2;i<=(int)Math.sqrt(n);i++){  // (int)Math.sqrt(n) by using this instead of n/2 the Time complexity = O(root(n))
                if(n%i==0){
                    isPrime = false;
                    break;
            }
            }
                if(isPrime)
                {
                    System.out.println("Prime");
                }
                else{
                    System.out.println("Not prime");
                }
                
            
            T--;
        }
    }
}
