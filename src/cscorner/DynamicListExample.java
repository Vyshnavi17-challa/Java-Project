package cscorner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class DynamicListExample {
    public static void main(String[] args) {
        // Create ArrayList and LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter student names (type 'stop' to finish):");

        // Loop to add elements dynamically
        while (true) {
            System.out.print("Enter name: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            arrayList.add(input);
            linkedList.add(input);
        }

        // Display the contents of both lists
        System.out.println("\nArrayList contents:");
        for (String name : arrayList) {
            System.out.println(name);
        }

        System.out.println("\nLinkedList contents:");
        for (String name : linkedList) {
            System.out.println(name);
        }

        scanner.close();
    }
}
