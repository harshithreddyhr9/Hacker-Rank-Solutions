import java.util.Scanner;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String pattern = in.nextLine();
            /*
            Compiles the given regular expression into a pattern with the given flags.
Parameters:
regex - The expression to be compiled
flags - Match flags, a bit mask that may include CASE_INSENSITIVE, MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL and COMMENTS
Throws:
IllegalArgumentException - If bit values other than those corresponding to the defined match flags are set in flags
PatternSyntaxException - If the expression's syntax is invalid
            */
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
