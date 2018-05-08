/*
Given integers b and a, find the smallest integer h such that there exists a triangle of height h, base b, having an area of at least a

Input Format

In the first and only line, there are two space-separated integers b and a,
denoting respectively the base of a triangle and the desired minimum area.

Output format
In a single line, print a single integer h, denoting the minimum height of a triangle with base b and area at least a

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   static int lowestTriangle(double base, double area){
    double h = 2*area/base; 
    return (int)(Math.ceil(h)); //This method returns the smallest integer that is greater than or equal to the argument.
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base = in.nextInt();
        double area = in.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
    }
}
