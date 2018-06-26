/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range [1......10^9].
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
*/


package Warmup;


import java.util.*;


public class Min_Max {

    
    static void miniMaxSum(int[] arr) {
       
       long max=0,min=0,sum=0;

         for(int i=0;i<5;i++){    
            sum += arr[i];
        
    }
        Arrays.sort(arr);
        max= sum - arr[0]; // The sum of 4 no.s is max when the smallest no. in the array is subtracted
        min= sum - arr[4]; // The sum of 4 no.s is min when the largest no. in the array is subtracted        
        System.out.println(min+" "+max);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }
        //System.out.println("h");
        miniMaxSum(arr);
    }
}

