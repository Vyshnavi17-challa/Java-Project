package cscorner;

import java.util.HashSet;

public class StudentHashSet {

	public static void main(String[] args) {
		HashSet<String> students=new HashSet<String>();
		students.add("Vyshu");
		students.add("Sarala");
		students.add("Suppi");
		students.add("Vyshu");
		System.out.println("List of Students:");
		for(String student:students) {
			System.out.println(student);
		}
	}

}
