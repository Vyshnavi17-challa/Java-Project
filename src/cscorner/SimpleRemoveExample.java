package cscorner;
import java.util.ArrayList;

public class SimpleRemoveExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Anu");
        students.add("Kyathi");
        students.add("Chaitra");
        students.add("Janu");
        System.out.println("Original List: " + students);

        // Remove by index (remove the second item - index 1)
        students.remove(1);
        System.out.println("After removing by index (1): " + students);

        // Remove by value (remove "Chaitra")
        students.remove("Chaitra");
        System.out.println("After removing by value (\"Chaitra\"): " + students);
    }
}
