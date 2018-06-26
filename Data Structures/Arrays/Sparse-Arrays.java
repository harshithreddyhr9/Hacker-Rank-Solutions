/*
There is a collection of N strings ( There can be multiple occurences of a particular string ). 
Each string's length is no more than 20 characters. There are also Q queries. 
For each query, you are given a string, and you need to find out how many times this string occurs in the given collection of N strings.

Input Format

The first line contains N, the number of strings.
The next N lines each contain a string.
The N+2nd line contains Q, the number of queries.
The following Q lines each contain a query string.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int[] solve(String[] strings, String[] queries) {
        int [] result = new int[queries.length];
        
         for(int i=0;i<queries.length;i++){
        	int count=0;
        for(int j=0;j<strings.length;j++){
            if(queries[i].equals(strings[j]))
                count++;
        }
            result[i]=count;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = solve(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
