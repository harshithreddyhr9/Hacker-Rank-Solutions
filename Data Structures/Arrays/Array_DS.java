/*
 * An array is a type of data structure that stores elements of the same type in a contiguous block of memory. 
 * In an array,A , of size N, each memory location has some unique index, i (where 0<=i<=N), that can be referenced as  A[i] (you may also see it written as ).

Given an array, A , of N integers, print each element in reverse order as a single line of space-separated integers.

Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

Input Format

The first line contains an integer, N (the number of integers in A). 
The second line contains N space-separated integers describing A.

Constraints
1<=N<=10^3
1<=Ai<=10^4 where Ai is the ith integere in A
Output Format

Print all N integers in A in reverse order as a single line of space-separated integers.
 */

package Arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Array_DS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int b[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int k=0;
       for(int j=n-1; j>=0; j--){
            b[k] = arr[j];
           k++;
        }
        for(int i=0; i < n; i++){
         System.out.print(b[i]+" ");
        }
    }
}