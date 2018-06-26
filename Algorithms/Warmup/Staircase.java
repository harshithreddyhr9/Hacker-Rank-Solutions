/*
 * Observe that its base and height are both equal to n,
 *  and the image is drawn using # symbols and spaces.
The last line is not preceded by any spaces.
Write a program that prints a staircase of size n.
Input Format
A single integer,n, denoting the size of the staircase.
Output Format
Print a staircase of size n using # symbols and spaces.
Note: The last line must have 0 spaces in it.
 */


package Warmup;


import java.util.*;

public class Staircase {

    
    static void staircase(int n) {
    	for(int i=1;i<=n;i++)
    	  {
    	   for(int j=1;j<=n;j++)
    	    
    	   {
    	    if((i+j)>n)
    	    {
    	    System.out.print("#");
    	    }
    	    else
    	    {
    	     System.out.print(" ");
    	    }
    	    
    	   }
    	   System.out.println();
    	   
    	  }
    	   
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
