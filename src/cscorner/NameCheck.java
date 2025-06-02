package cscorner;

import java.util.*;

public class NameCheck {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = Arrays.asList("Chaitra", "Janu", "Kyathi", "Vyshu");

        // Name to check
        String nameToCheck = "Janu";

        // Check if the name exists
        if (names.contains(nameToCheck)) {
            System.out.println(nameToCheck + " exists in the list.");
        } else {
            System.out.println(nameToCheck + " does not exist in the list.");
        }
    }
}
