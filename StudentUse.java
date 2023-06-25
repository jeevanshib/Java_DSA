package ObjectOrientedProgramming;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Contructor
		Student s1 = new Student("Jeevanshi", 209302038);
		Student s2 = new Student("Jeevanshi", 209302038);
		Student s3 = new Student("Jeevanshi", 209302038);
//		s1.name="Jeevanshi";
//		s1.setrollNum(209302038);
//		System.out.println(s1.name);
//		System.out.println(s1.getrollNum());
		s1.print();
		s2.print();
		s3.print();
		System.out.println(Student.getnumStudents());
		
	}

}
