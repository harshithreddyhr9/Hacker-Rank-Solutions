/*
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine=0).
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, fine = 15 x no of days late.
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the fine = 500 x no of months late..
If the book is returned after the calendar year in which it was expected, there is a fixed fine of 1000 hackos.

Input Format

The first line contains  space-separated integers denoting the respective day, month, and year on which the book was actually returned. 
The second line contains  space-separated integers denoting the respective day, month, and year on which the book was expected to be returned (due date).

Constraints
1<=D<=31
1<=M<=12
1<=Y<=3000

Output Format

Print a single integer denoting the library fine for the book received as input.

Sample Input

9 6 2015
6 6 2015

Sample Output
45

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int actualDay = scan.nextInt();
    int actualMonth = scan.nextInt();
    int actualYear = scan.nextInt();
    int expectedDay = scan.nextInt();
    int expectedMonth = scan.nextInt();
    int expectedYear = scan.nextInt();
    scan.close();
    int monthsLate = actualMonth - expectedMonth;
    int daysLate = actualDay - expectedDay;
    int yearDiference = actualYear - expectedYear;
  
    if((actualYear - expectedYear > 0 ))
        System.out.println("10000");
    else if(actualMonth - expectedMonth > 0 && yearDiference == 0)
        System.out.println(monthsLate * 500);
    else if(actualDay - expectedDay > 0 && yearDiference == 0)
        System.out.println(daysLate * 15)
        
    else{
        System.out.println("0");
    }

    }
    
}
