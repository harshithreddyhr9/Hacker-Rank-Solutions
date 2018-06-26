package problems30;
import java.util.Scanner;

/*
 * Given a string, S, of length N that is indexed from 0 to N-1,
 *  print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Input Format

The first line contains an integer, T(the number of test cases). 
Each line i of the T subsequent lines contain a String, S.
 */
public class Lets_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine().trim());
        while(n>0){
            String s1 = sc.nextLine();
            Evenchar(s1);
            Oddchar(s1);
        n--;
        
	}
    }	
	public static void Evenchar(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			i++;
		}
		System.out.print(" ");
	}
	
	public static void Oddchar(String s) {
		
		for(int j=1; j<s.length();j++) {
			System.out.print(s.charAt(j));
			j++;
		}System.out.println();
	}
}
