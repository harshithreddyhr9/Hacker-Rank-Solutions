/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in to be a subset of values with indices falling in this pattern in 's graphical
representation:
a b c
d
e f g
There are hourglasses in , and an hourglass sum is the sum of an hourglass' values.
Task
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this
challenge.
Input Format
There are lines of input, where each line contains space-separated integers describing 2D Array ;
every value in will be in the inclusive range of to .
Constraints
Output Format
Print the largest (maximum) hourglass sum found in .
 */
package Arrays;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DS_2D_Array {

    /*
     * array2D function below.
     */
    static int array2D(int[][] arr) {
        int sum =0;
        int maxsum=-1000;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum>maxsum)
                    maxsum=sum;
                else{
                    
                }
                    
                
                
            }
        }
        return maxsum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int arrRowItr = 0; arrRowItr < 6; arrRowItr++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int arrColumnItr = 0; arrColumnItr < 6; arrColumnItr++) {
                int arrItem = Integer.parseInt(arrRowItems[arrColumnItr].trim());
                arr[arrRowItr][arrColumnItr] = arrItem;
            }
        }

        int result = array2D(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

