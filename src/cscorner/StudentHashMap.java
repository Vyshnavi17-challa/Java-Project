package cscorner;
import java.util.HashMap;
import java.util.Map;
public class StudentHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> students=new HashMap<Integer,String>();
		students.put(01,"Vyshu");
		students.put(02,"Suppi");
		students.put(03,"Saru");
		students.put(01,"Vyshu");
		System.out.println("Student List(ID->Name):");
		for(Map.Entry<Integer,String> entry:students.entrySet()) {
			System.out.println("ID:"+entry.getKey()+",Name:"+entry.getValue());
		}
	}

}
