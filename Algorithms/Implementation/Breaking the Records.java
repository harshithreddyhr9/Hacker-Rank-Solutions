/*
Given Maria's array of scores for a season of n games, find and print the number of times she breaks her records for most and least points scored during the season.

Input Format

The first line contains an integer n, the number of games. 
The second line contains n space-separated integers describing the respective values of .

Constraints
1<=n<=1000
0<=score<=10^8

Output Format

Print two space-seperated integers describing the respective numbers of times her best (highest) score increased and her worst (lowest) score decreased.

*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] score) {
    int [] count = new int [2];
        int highest = score[0];
        int lowest = score[0];
        for(int i=1;i<score.length;i++){
            if(score[i]>highest){ // check if the new number is greater than the highest. increment count[0]
                highest=score[i];
                count[0]++;
            }
            else if (score[i]<lowest){ //check if the new number is less than the lowest. increment count[1]
                lowest = score[i];
                count[1]++;
            }
        }
return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] score = new int[n];

        String[] scoreItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoreItem = Integer.parseInt(scoreItems[i]);
            score[i] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
