package Warmup;


import java.util.*;


public class Min_Max {

    
    public static void miniMaxSum(int[] arr) {
    	
    	long min=10000000,max=0;	
    	for(int i=0;i<5;i++) 
    	{
    		long sum=0;
        	for(int j=0;j<5;j++)
        		{
        			if(i!=j) 
        			{
        			sum += arr[j];
        			}
        		
        		}
        	System.out.println(sum);
        	 if(sum >max && sum<min) {
        		max=sum;
        		min=sum;
        	}
        	else if(sum>max){
        		max=sum;
        	}
        	else if (sum<min){
        		min = sum;
        	}
        }
    	
    	System.out.print(min);
    	System.out.println(" "+max);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }
        //System.out.println("h");
        miniMaxSum(arr);
    }
}

