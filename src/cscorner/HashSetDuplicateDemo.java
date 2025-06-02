package cscorner;

import java.util.*;

public class HashSetDuplicateDemo {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // Duplicate
        set.add("Cherry");
        set.add("Banana"); // Duplicate
        System.out.println("HashSet contents: " + set);
    }
}
