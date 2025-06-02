package cscorner;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Create a list
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Get the iterator
        Iterator<String> iterator = list.iterator();

        // Iterate using the iterator
        System.out.println("Iterating through the list:");
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}