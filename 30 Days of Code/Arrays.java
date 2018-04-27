/*
Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.

Input Format

The first line contains an integer, N (the size of our array). 
The second line contains  space-separated integers describing array A's elements.


Output Format

Print the elements of array A in reverse order as a single line of space-separated numbers.
*/import java.io.*;
import java.util.*;


public class Arrays{

    public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			reverserotate(a, 0, n-1);
			printarray(a,n);
	}
	
	static void reverserotate(int a[], int start, int end)
	{
		int temp;
		while(start<end)       // swapping the last and first elements and incrementing & decrementing the first and last index value
		{
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
	//====================Printing the reversed array=====================================================================================
	public static void printarray(int a[], int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(""+a[i]+" ");
		}
	}
}
