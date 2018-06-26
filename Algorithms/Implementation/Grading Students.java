/*
HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's grade according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round  up to the next multiple of 5.
If the value of  is less than , no rounding occurs as the result will still be a failing grade.

Input Format

The first line contains a single integer denoting n (the number of students). 
Each line  of the  subsequent lines contains a single integer, grade, denoting student i's grade.

Output Format

For each gradei of the n grades, print the rounded grade on a new line.
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades, int n) {
        for(int i=0;i<n;i++){
        if((5*((grades[i]/5) + 1) - grades[i]) < 3 && grades[i] > 37)  // Difference (5x-marks<3 and marks >37)
            grades[i]= 5*((grades[i]/5) + 1);
        
    }
        return grades;
    }
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades,n);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
