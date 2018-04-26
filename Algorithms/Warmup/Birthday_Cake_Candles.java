/*
 * You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age.
 *  When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.

For example, if your niece is turning 4 years old, and the cake will have  candles of height 3, 2, 1, 3, she will be able to blow out candles successfully,
 since the tallest candle is of height 3 and there are 2 such candles.

Complete the function birthdayCakeCandles that takes your niece's age and an integer array containing height of each candle as input, and return the number of candles she can successfully blow out.

Input Format

The first line contains a single integer,n , denoting the number of candles on the cake. 
The second line contains  n space-separated integers, where each integer i  describes the height of candle i.

Output Format

Print the number of candles the can be blown out on a new line.

Sample input
4
3 1 2 3
Sample output
2 */



package Warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Birthday_Cake_Candles {


    static int birthdayCakeCandles(int n, int[] ar) {
    		sort(ar,n);
    		int count=0;
    	for(int k=0;k<n;k++) {
    		if(ar[k]==ar[n-1]) {
    			count++;
    		}
    	}
    	
    	
    	return count;
    }
    

    public static void sort(int ar[], int n)
    {
        //int n = ar.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(ar, n, i);
 
        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = ar[0];
            ar[0] = ar[i];
            ar[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(ar, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heapify(int ar[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && ar[l] > ar[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && ar[r] > ar[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i)
        {
            int swap = ar[i];
            ar[i] = ar[largest];
            ar[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(ar, n, largest);
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        //bw.write(String.valueOf(result));
        //bw.newLine();
        System.out.println(result);
        //bw.close();
    }
}
