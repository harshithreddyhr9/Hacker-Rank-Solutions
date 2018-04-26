<<<<<<< HEAD
/*
 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. 
 Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. 
The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeros in the array compared to its size.
 * 
*/
package Warmup;



import java.util.*;


public class Plus_Minus {

   
    static void plusMinus(int[] arr) {
    	double positive=0, negative=0, zero=0;
        for(int j=0;j<arr.length;j++) {
        	if(arr[j]>0) {
        		positive++;
        	}
        	else if(arr[j]<0) {
        		negative++;
        	}
        	else {
        		zero++;
        	}
        }
        System.out.println(String.format("%.6g%n",(positive/arr.length)));
        System.out.println(String.format("%.6g%n",(negative/arr.length)));
        System.out.println(String.format("%.6g%n",(zero/arr.length)));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}

=======
/*
 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. 
 Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. 
The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeros in the array compared to its size.
 * 
*/
package Warmup;



import java.util.*;


public class Plus_Minus {

   
    static void plusMinus(int[] arr) {
    	double positive=0, negative=0, zero=0;
        for(int j=0;j<arr.length;j++) {
        	if(arr[j]>0) {
        		positive++;
        	}
        	else if(arr[j]<0) {
        		negative++;
        	}
        	else {
        		zero++;
        	}
        }
        System.out.println(String.format("%.6g%n",(positive/arr.length)));
        System.out.println(String.format("%.6g%n",(negative/arr.length)));
        System.out.println(String.format("%.6g%n",(zero/arr.length)));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}

>>>>>>> 4205568a33345c1a645491753998a0c7509ed887
