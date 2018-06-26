import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {
    
   static String timeConversion(String s) {
        String z="";
        
           int hour = Integer.parseInt( s.split(":")[0] ); // 12:34:45AM (12 is stored in hour)
           if(hour==12 && s.contains("AM")){
                     int newhour = hour-12;
                     
                    String f = String.format("%02d", newhour); // %02d for getting two zeros. 
                     String n = s.replace(s.split(":")[0], f ); // 12 is replaced with f
                     
                     z = n.replace("AM",""); // In 24 hr clock 
                     
           }
           else if(hour==12 && s.contains("PM")) {    
                	z= s.replace("PM", "");
           } 
       
           else if(hour<12 && s.contains("AM")) {
                 z = s.replace("AM","");
           } 
           else if(hour<12 && s.contains("PM")){
               int newhour = hour+12;
                     String v = String.valueOf(newhour);
                     String n = s.replace(s.split(":")[0], v );
                     z = n.replace("PM","");
           }
        return z;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        
        bw.write(result);
        bw.newLine();
        bw.close();
    }
}
