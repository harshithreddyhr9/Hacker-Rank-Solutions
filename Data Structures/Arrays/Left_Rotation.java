/*
A left rotation operation on an array of size shifts each of the array's elements unit to the left. For
example, if left rotations are performed on array , then the array would become
.
Given an array of integers and a number, , perform left rotations on the array. Then print the updated
array as a single line of space-separated integers.
Input Format
The first line contains two space-separated integers denoting the respective values of (the number of
integers) and (the number of left rotations you must perform).
The second line contains space-separated integers describing the respective elements of the array's initial
state.
Constraints
Output Format
Print a single line of space-separated integers denoting the final state of the array after performing left
rotations.
Sample Input
5 4
1 2 3 4 5
Sample Output
5 1 2 3 4

 */

package Arrays;
//import java.io.*;
//import java.math.*;
//import java.text.*;
import java.util.*;
//import java.util.regex.*;


public class Left_Rotation {
	private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scan.nextLine().split(" ");
        Left_Rotation s= new Left_Rotation();
        int n = Integer.parseInt(nd[0].trim());

        int d = Integer.parseInt(nd[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }
        s.leftRotate(a,d, n); //Calling the leftRotate function
    
    }
    public void leftRotate(int a[], int d, int n)
    {
        for(int i=0;i<d;i++)
            leftRotatebyOne(a,n);
        printarray(a,n);
    }
//================= Using temp the elements are rotated to the left ==============
    public void leftRotatebyOne(int a[], int n)
    { 
        
        int temp=a[0];
        int j;
        for(j=0;j<n-1;j++)
            a[j]=a[j+1];
        a[j]=temp;
    }
    
    public void printarray(int a[],int n)
    {
        for(int k=0;k<n;k++)
        System.out.print(""+a[k]+" ");
    }
}
