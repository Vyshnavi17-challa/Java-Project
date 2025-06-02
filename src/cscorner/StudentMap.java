package cscorner;
import java.util.HashMap;
import java.util.Map;
public class StudentMap {
	public static void main(String[] args) {
		HashMap<Integer, String> studentmap = new HashMap<Integer, String>();
		studentmap.put(01, "Vyshu");
		studentmap.put(02, "Kyathi");
		studentmap.put(03, "Chaitra");
		studentmap.put(04, "Janu");
		System.out.println("Student List:");
		for(Map.Entry<Integer, String> entry:studentmap.entrySet()) {
			System.out.println("Roll number:"+entry.getKey()+" , Name:" +entry.getValue());
		}
		int rollno=04;
		String name=studentmap.get(rollno);
		System.out.println("\n Name of student with rollno"+rollno+": "+name);
	}
}
