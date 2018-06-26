/*
Read a string, S, and print its integer value; if S cannot be converted to an integer, print Bad String.
*/

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int n = Integer.parseInt(S);
            System.out.println(n);
    }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
}
