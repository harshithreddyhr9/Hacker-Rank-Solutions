
import java.util.Scanner;

public class Queue {

	
		static long total =0;
		static long front =-1;
		static long rear=-1;
		static long q[];
		static long size;
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue qw = new Queue();
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		size = t;
		q = new long[(int) t];
		while(t>0) {
			int x = sc.nextInt();
			
			switch(x) {
			case 1:
				int value = sc.nextInt();
				//System.out.println(value);
				enqueue(value);
				break;
			case 2:
				dequeue();
				break;
			case 3:
				print();
				break;
			}
	t--;
	}
		sc.close();

}
	



public static boolean enqueue(int item) {
	
	if(isFull())
		return false;
	else if(isEmpty()){
		front =0;
		rear=0;
		total++;
		q[(int) rear]= item;
		return true;
	}
	else {
		total++;
		rear = (rear+1)%size ;
		q[(int) rear]= item;
		
		return true;
	}
}
public static boolean isFull() {
	if(size == total) 
		return true;
	else {
			return false;
		}
	}


public static boolean dequeue() {
	if(isEmpty())
		return false;
	else {
		total--;
		front = (front+1) %size;
        return true;
		 }
}
public static boolean isEmpty() {
	if(front==-1 && rear==-1)
		return true;
	else {
		return false;
	}
	
}

public static void print()
{

		System.out.println(q[(int) front]);
}
}
