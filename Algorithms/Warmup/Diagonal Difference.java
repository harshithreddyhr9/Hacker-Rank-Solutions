/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
*/
import java.util.*;


public class DiagonalDifference {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a,int n) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++)
        {
            sum1= sum1+a[i][i];
        }
        //System.out.println(sum1);
        for(int j=0;j<n;j++)
        {
             for(int k=0;k<n;k++)
             {
                 if(j+k==n-1)
                     sum2 = sum2 + a[j][k];
             }
    
        }
        if(sum1>sum2)
            return sum1-sum2;
        else{
            return sum2-sum1;
    }
        
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a,n);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
