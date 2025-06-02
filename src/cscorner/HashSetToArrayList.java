package cscorner;

import java.util.*;

public class HashSetToArrayList {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Convert HashSet to ArrayList
        ArrayList<String> list = new ArrayList<>(set);

        // Print the ArrayList
        System.out.println("ArrayList: " + list);
    }
}
