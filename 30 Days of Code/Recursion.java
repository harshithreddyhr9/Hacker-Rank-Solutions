import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Recursion {

    static int factorial(int n) {
        
    {
        int result;

       if(n==1)
         return 1;

       result = factorial(n-1) * n;
       return result;
    }
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}
