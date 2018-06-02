/*
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string, s.

Constraints
1<=length of s <=4*10^5

s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
Output Format

On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique).
Next, print each of the n tokens on a new line in the same order as they appear in input string s.

Sample Input
He is a very very good boy, isn't he?

Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // 
        String [] words = s.trim().split("[ !,?.\\_'@]+"); // Regeluar expression, + means once or more
        /*The java string trim() method eliminates leading and trailing spaces. The unicode value of space character is '\u0020'.
        The trim() method in java string checks this unicode value before and after the string,
        if it exists then removes the spaces and returns the omitted string.
        */
        if (s == null || s.trim().equals("")) { //if nothing is entered or is a whitespace
           System.out.println("0");
 }
        else
        {
        System.out.println(words.length);
        }

        for(String w:words)
        	System.out.println(w);
        scan.close();
    }
}

