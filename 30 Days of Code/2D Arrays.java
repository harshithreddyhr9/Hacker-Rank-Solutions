/*

Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

*/

import java.util.*;

public class 2DArrays {

   
    static int array2D(int[][] arr) {
        int sum =0;
        int maxsum=-1000;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
           //============= a(0,0)+a(0,1)+a(0,2)+a(1,1)+a(2,0)+a(2,1)+a(2,2)==================================
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum>maxsum)
                    maxsum=sum;
                
            }
        }
        return maxsum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int arrRowItr = 0; arrRowItr < 6; arrRowItr++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int arrColumnItr = 0; arrColumnItr < 6; arrColumnItr++) {
                int arrItem = Integer.parseInt(arrRowItems[arrColumnItr].trim());
                arr[arrRowItr][arrColumnItr] = arrItem;
            }
        }

        int result = array2D(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
