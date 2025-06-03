package xyz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapFromListExample {
    public static void main(String[] args) {
     
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");
        names.add("Bob");
        System.out.println("List of names: " + names);
        Map<String, Integer> nameCountMap = new HashMap<>();
         for (String name : names) {
            if (nameCountMap.containsKey(name)) {
                nameCountMap.put(name, nameCountMap.get(name) + 1);
            } else {
                nameCountMap.put(name, 1);
            }
        }
        System.out.println("Name frequency count: " + nameCountMap);
    }
}