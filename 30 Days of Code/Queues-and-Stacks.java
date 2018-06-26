/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backwards and forwards. 
Can you determine if a given string, , is a palindrome?


Input Format

You do not need to read anything from stdin. The locked stub code in your editor reads a single line containing string s. It then calls the methods specified above to pass each character to your instance variables.

Constraints

s is composed of lowercase English letters.
Output Format

You are not responsible for printing any output to stdout. 
If your code is correctly written and s is a palindrome, the locked stub code will print The word, s is a palindrome ; otherwise, it will print s is not a palindrome

Sample Input

racecar
Sample Output

The word, racecar, is a palindrome.


*/


import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
    int stack[] = new int[100];
    int queue[] = new int[100];
    int top=-1;
    int front=0;
    int rear=0;
    void pushCharacter(int c){
        top++;
        stack[top]=c;
    }
    void enqueueCharacter(int c){
        queue[rear]=c;
        rear++;
    }
    int popCharacter(){
        int value = stack[top];
        top--;
        return value;
    }
    int dequeueCharacter(){
        int item = queue[front];
        front++;
        return item;
    }
    
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
