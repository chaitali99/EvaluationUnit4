package que4;

import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		int roll,marks;
		String name;
		
		Student s1=new Student(roll,name,marks);
		
		System.out.println("Enter number of student deatils you want");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter Roll Number:");
			roll=s1.getRollNumber(sc.nextInt());	
			
			System.out.println("Enter Name:")
			name=s1
		}
		
	}
}
