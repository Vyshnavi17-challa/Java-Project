package cscorner;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<String> students=new ArrayList<String>();
		students.add("Vyshu");
		students.add("Sarala");
		students.add("Suppi");
		students.add("Varsha");
		System.out.println("List of Students:");
		for(String student:students) {
			System.out.println(student);
		}
	}

}
