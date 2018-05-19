/*
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If a and b are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input:
The first line contains a string denoting a. 
The second line contains a string denoting b.

Output
Print "Anagrams" if a and b are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.
*/

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();  //change the csae to either lower or upper
        b = b.toLowerCase();
        
        
        char[] first = a.toCharArray(); //convert the string to character array so that even can compare each character present in the 2 strings
        char[] second = b.toCharArray();
        Arrays.sort(first); // the characters are sorted alphabetically 
        Arrays.sort(second);
        return Arrays.equals(first, second); //true if both the strings contain the same letters
        
    }
        public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

