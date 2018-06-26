import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2!=0)
{
	System.out.println("Weird");
}
else if(n%2==0 && 2<=n && n<=5)
	{
		System.out.println("Not Weird");
	}

	else if(n%2==0 && 6<=n && n<=20)
	{
		System.out.println("Weird");
	}
	else if(n%2==0 && n>20){

		System.out.println("Not Weird");
	}
    else{
        System.out.println("Invalid");
    }
}
}

