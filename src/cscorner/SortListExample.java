package cscorner;

import java.util.ArrayList;
import java.util.Collections;

public class SortListExample {

	public static void main(String[] args) {
		ArrayList<String> students=new ArrayList<String>();
		students.add("Vyshu");
		students.add("Sarala");
		students.add("Bhanu");
		students.add("Kyathi");
		System.out.println("List of Students:" +students);
		Collections.sort(students);
		System.out.println("Sorted the list Alphabetically:"+students);
	}

}
