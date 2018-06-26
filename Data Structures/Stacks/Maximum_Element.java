import java.util.Scanner;

public class Maximum_Element {
	static int top=-1;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int t = sc.nextInt();
		int [] ar = new int[t];
		while(t!=0) {
			
			int x = Integer.parseInt(sc.next());
			if(x==1) {
				int y = Integer.parseInt(sc.next());
				push(ar,y);
			}
			else if(x==3) {
				topElement(ar);
		
			}
			else {
				pop();
			}
		t--;
		}
		
	}

	public static void push (int ar[ ] , int x) {
		 
		        top = top +1 ;            //Incrementing top position 
		        ar[ top ] = x ;       //Inserting element on incremented position  
		 
		}
	
	public static void pop ( ) 
    { 
             top = top - 1 ; //Decrementing top’s position will detach last element from stack            
    
    }
	
	

	public static void topElement (int ar[])
    {
        System.out.println(ar[ top ]);
    }
}
