/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers, a and b.

Constraints

a and b are non-negative integers and can have maximum 200 digits.

Output Format

Output two lines. The first line should contain a+b, and the second line should contain . Don't print any leading zeros.

Sample Input

1234
20
Sample Output

1254
24680
*/

/*
BigInteger class is used for mathematical operation which
involves very big integer calculations that are outside the limit of all available primitive data types.

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     BigInteger a = new BigInteger(sc.next());
     BigInteger b = new BigInteger(sc.next());

        BigInteger  sum, prod;
        sum = a.add(b);
        prod = a.multiply(b);
        System.out.println( sum);
        System.out.println( prod);
        
    }
}