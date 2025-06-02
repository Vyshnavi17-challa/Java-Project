package cscorner;
import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Original list: " + list);
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
    }
}
