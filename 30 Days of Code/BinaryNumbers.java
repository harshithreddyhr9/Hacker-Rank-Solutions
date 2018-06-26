/*
 * Given a base-10 integer, n , convert it to binary (base-2).
 *  Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

Input Format
A single integer, .

Constraints
1<=n<=10^6

Output Format
Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .
 */
package src.problems30;

import java.util.Scanner;

public class BinaryNumbers {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=0,count=1,temp=0;
        int [] rem = new int [100];
   // ======== Converting the base-10 no. to base-2 no.=====================
        while(n>0)
        {
            rem[i] = n%2;
            n=n/2;
            i++;
           
        }
        for(int j=0;j<99;j++){
            if(rem[j]==1 && rem[j+1]==1)
                count++; //Increment when there are consecutive 1's
            else{
                    if(count>temp) // Store the value of count in temp because
                    			   // the value of count can inc or dec.
                        temp=count;
                count=1; // reset the value of count to find a consecutive series of 1's again
            }
        }
        System.out.println(temp); // Temp stores the highest no of consecutive 1's
    }
}

