/*
Given an array, a, of size N distinct elements, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following 3 lines:

Array is sorted in numSwaps swaps. 
where numSwaps is the number of swaps that took place.
First Element: firstElement 
where firstElement is the first element in the sorted array.
Last Element: lastElement 
where lastElement  is the last element in the sorted array.
Hint: To complete this challenge, you will need to add a variable that keeps a running tally of all swaps that occur during execution.

Input Format

The first line contains an integer, n, denoting the number of elements in array a. 
The second line contains n space-separated integers describing the respective values of a0,a1,a2....an-1 .

Constraints
2<=n<=60
1<=ai<=2*10^6, where 0<=i<=n

Output Format

Print the following three lines of output:

Array is sorted in numSwaps swaps. 
where numSwaps is the number of swaps that took place.
First Element: firstElement 
where firstElement is the first element in the sorted array.
Last Element: lastElement 
where lastElement  is the last element in the sorted array.
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort(a); // if the input is large it is advisable to use heap sort as its worst case time complexity is O(nlogn) when to compared to Bubble sort's O(n^2)
        print(a);
    }
    public static void bubbleSort(int a[]){
        int count=0;
        int n = a.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (a[j] > a[j+1])
                {
                    // swap temp and arr[i]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    count++; // after each swap, increment the count.
                }
        System.out.println("Array is sorted in "+count+" swaps.");
    }

    public static void print(int a[])
    {
        
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    
    }
}
