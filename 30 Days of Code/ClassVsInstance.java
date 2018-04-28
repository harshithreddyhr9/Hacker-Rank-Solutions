import java.util.Scanner;

/*
 * Write a Person class with an instance variable, age, and a constructor that takes an integer,initialAge , as a parameter.
 * The constructor must assign initialAge to  after confirming the argument passed as initialAge is not negative; 
 * if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:

1. yearPasses() should increase the age instance variable by 1.
2. amIOld() should perform the following conditional actions:
If age<13, print You are young..
If age>=13 and age<18, print You are a teenager..
Otherwise, print You are old..

Input Format

The first line contains an integer,  (the number of test cases), and the  subsequent lines each contain an integer denoting the of a Person instance.

Constraints
1<=T<=4
-5<=age<=30

Output Format

Complete the method definitions provided in the editor so they meet the specifications outlined above; the code to test your work is already in the editor. 
If your methods are implemented correctly, each test case will print 2 or 3 lines (depending on whether or not a valid initialAge was passed to the constructor).
 */
public class ClassVsInstance {
	private int age;
	
	public ClassVsInstance(int initialAge) {
		if(initialAge<0) {
			this.age=0;
			System.out.println("Age is not valid, setting age to 0..");
		}
		else {
			this.age=initialAge;
		}
	}
	
	public void yearPasses() {
		age++;
	}

	public void amIOld() {
		if(age<13) {
			System.out.println("You are young");
		}
		else if(age>=13 && age<18) {
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are old");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassVsInstance c = new ClassVsInstance(age);
			c.amIOld();
			for (int j = 0; j < 3; j++) {
				c.yearPasses();
				}
			c.amIOld();
			System.out.println();
		}
		sc.close();
	}

	

}
