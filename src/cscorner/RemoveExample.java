package cscorner;

import java.util.HashMap;

public class RemoveExample {

	public static void main(String[] args) {
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(01, "Vyshu");
		student.put(02, "Kyathi");
		student.put(03, "Chaitra");
		student.put(04, "Janu");
		student.remove(3);
		student.put(05, "Siri");
		System.out.println(student);

	}

}
