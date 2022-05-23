package que2;
import java.util.*;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	public void displayCourseDetails(int id,String name,int fee) {
		System.out.println("Course Id:"+id);
		System.out.println("Course name: "+name);
		System.out.println("Course Fee: "+fee);
		
	}
	
	public static void authenticate(String username,String Password) {
		if(username=="Admin" && Password=="1234") {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Course Id :");
			int c=sc.nextInt();
			
			System.out.println("Enter course name:");
			String n=sc.next();
			sc.nextLine();
			
			System.out.println("Enter course fee:");
			int f=sc.nextInt();
			
			Course cd=new Course();
			cd.displayCourseDetails(c, n, f);
		}
		else 
		{
			System.out.println("Invalid Authentication");
		}
	}
	public static void main(String [] args) {
		authenticate("Admin","1234");
		authenticate("Chaitali","Chaitu123");
	}
}
