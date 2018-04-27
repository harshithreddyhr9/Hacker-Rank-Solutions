/*
We define the rating for Alice's challenge to be the triplet , and the rating for Bob's
challenge to be the triplet .
Your task is to find their comparison scores by comparing with , with , and with .
If a[i]>b[i], then Alice is awarded point.
If a[i]<b[i], then Bob is awarded point.
If a[i]=b[i], then neither person receives a point.

Comparison score is the total score a person earned.
Given A and B, can you compare the two challenges and print their respective comparison points?

Input Format
The first line contains 3 space-separated integers,a[0], a[1], and a[2], describing the respective values in
triplet A.
The second line contains 3 space-separated integers,b[0] ,b[1] , and b[2], describing the respective values in
triplet B.

Output Format
Print two space-separated integers denoting the respective comparison scores earned by Alice and Bob.

*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int pointsAlice=0, pointsBob=0;
        pointsAlice = ((a0>b0)?1:0)+ ((a1>b1)?1:0)+ ((a2>b2)?1:0) ;
        pointsBob = ((a0<b0)?1:0)+ ((a1<b1)?1:0)+ ((a2<b2)?1:0) ;
        int A[] = {pointsAlice, pointsBob};
        return A;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] a0A1A2 = scan.nextLine().split(" ");

        int a0 = Integer.parseInt(a0A1A2[0].trim());

        int a1 = Integer.parseInt(a0A1A2[1].trim());

        int a2 = Integer.parseInt(a0A1A2[2].trim());

        String[] b0B1B2 = scan.nextLine().split(" ");

        int b0 = Integer.parseInt(b0B1B2[0].trim());

        int b1 = Integer.parseInt(b0B1B2[1].trim());

        int b2 = Integer.parseInt(b0B1B2[2].trim());

        int result[] = solve(a0, a1, a2, b0, b1, b2);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}
