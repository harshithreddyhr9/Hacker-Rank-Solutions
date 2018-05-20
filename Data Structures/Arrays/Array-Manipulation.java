/*
You are given a list(1-indexed) of size n, initialized with zeroes. 
You have to perform m operations on the list and output the maximum of final values of all the n elements in the list.
For every operation, you are given three integers a,b  and k and you have to add value k to all the elements ranging from index a to b(both inclusive).

For example, consider a list a of size 3. The initial list would be  a= [0, 0, 0] and after performing the update O(a,b,k) = (2,3,30), the new list would be  a= [0, 30, 30]. Here, we've added value 30 to elements between indices 2 and 3. Note the index of the list starts from 1.

Input Format

The first line will contain two integers n and m separated by a single space.
Next m lines will contain three integers a, b and k separated by a single space.
Numbers in list are numbered from 1 to n.

Constraints
3<=n<=10^7
1<=m<=2*10^5
1<=a<=b<=n
0<=k<=10^9

Output Format

Print in a single line the maximum value in the updated list.
*/

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		        
		//This will be the "difference array". The entry arr[i]=k indicates that arr[i] is exactly k units larger than arr[i-1]
		long[] arr = new long[n];
		        
		int lower;
		int upper;
		long sum;

		for(int i=0;i<n;i++) arr[i]=0;

		for(int i=0;i<m;i++){
		    lower=scan.nextInt();
		    upper=scan.nextInt();
		    sum=scan.nextInt();
		    arr[lower-1]+=sum;
		    if(upper<n) arr[upper]-=sum; 
		}
		        
		long max=0;
		long temp=0;

		for(int i=0;i<n;i++){
		    temp += arr[i];
		    if(temp> max) max=temp;
		}

		System.out.println(max);
	}

}
