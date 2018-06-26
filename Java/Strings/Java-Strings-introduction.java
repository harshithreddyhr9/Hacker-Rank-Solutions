/*
Given two strings of lowercase English letters, AA and BB, perform the following operations:

Sum the lengths of AA and BB.
Determine if AA is lexicographically larger than BB (i.e.: does BB come before AA in the dictionary?).
Capitalize the first letter in AA and BB and print them on a single line, separated by a space.
Input Format

Two strings, the first being AA and the second being BB. They are comprised of lowercase English letters (no symbols or spaces) and may not be on the same line.

Output Format

There are three lines of output: 
For the first line, sum the lengths of AA and BB. 
For the second line, write Yes if AA is lexicographically larger than BB or No if it is not. 
For the third line, capitalize the first letter in both AA and BB and print them on a single line, separated by a space.

Sample Input

 hello
 java
Sample Output

9
No
Hello Java
Explanation

String AA is "hello" and BB is "java". 
AA has a length of 55, and BB has a length of 44; the sum of their lengths is 99. 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore, AA is not larger than BB and the answer is NO. 
When you capitalize the first letter of both AA and BB and then print them separated by a space, you get "Hello Java".


import java.io.*;
import java.util.*;

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length()); // Printing the sum of lengths of 2 strings
       
     /* compareTo is used to compare 2 strings lexicographically. 
     If both the strings are equal then this method returns 0 else it returns positive or negative value. 
     The result is positive if the first string is lexicographically greater than the second string else the result would be negative.
        */
        int i = A.compareTo(B);  
        if(i>0){
             System.out.println("Yes");
        } else{
             System.out.println("No");
        }
        String afinal = A.substring(0,1).toUpperCase()+A.substring(1);
        String bfinal = B.substring(0,1).toUpperCase()+B.substring(1);;
        System.out.println(afinal+" "+bfinal);
            
    }
}
