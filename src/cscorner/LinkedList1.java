package cscorner;

import java.util.HashSet;
import java.util.Scanner;

public class LinkedList1 {

	public static void main(String[] args) {
		HashSet<String> Student=new HashSet<String>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter names of students");
		for(int i=1;i<=5;i++) {
			System.out.println("Enter name of 5 students"+i+":" );
			String name=sc.nextLine();
			Student.add(name);
		}
		System.out.println("Students names are:");
		for(String student:Student
				) {
			System.out.println(student);
		}
		sc.close();
	}

}
