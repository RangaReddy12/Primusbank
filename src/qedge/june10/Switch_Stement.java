package qedge.june10;
import java.util.Scanner;
public class Switch_Stement {
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i=1; i<=5; i++)
		{
		System.out.println("Enter Course");
		String course=s.nextLine();
		switch(course.toUpperCase())
		{
		case "MANUAL":
			System.out.println("Course is Aviable::"+course);
			break;
		case "SELENIUM":
			System.out.println("Course is Aviable::"+course);
			break;
		case "QTP":
			System.out.println("Course is Aviable::"+course);
			break;
		case "JAVA":
			System.out.println("Course is Aviable::"+course);
			break;
		case "DATASCIENCE":
			System.out.println("Course is Aviable::"+course);
			break;
		default:
			System.out.println("Sorry Not Aviable::"+course);
			break;
		}
	}
	}
}


