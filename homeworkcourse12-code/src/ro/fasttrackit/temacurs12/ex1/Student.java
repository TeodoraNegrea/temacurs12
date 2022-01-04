package ro.fasttrackit.temacurs12.ex1;

import java.security.KeyStore;
import java.util.*;

public class Student {
    public static void main(String[] args) {
        Map<String, Integer> gradesForStudents = new HashMap<>();
        gradesForStudents.put("Mihai", 8);
        gradesForStudents.put("Ioana", 6);
        gradesForStudents.put("Rares", 7);
        gradesForStudents.put("Diana", 5);
        gradesForStudents.put("Sofia", 9);
        gradesForStudents.put("Paul", 10);
        gradesForStudents.put("Ionel", 5);

        System.out.println(gradesForStudents);

        System.out.println(gradesForStudents.keySet());
        System.out.println(gradesForStudents.values());
        Set<Map.Entry<String, Integer>> grades = gradesForStudents.entrySet();
        System.out.println(grades);

        Set<Map.Entry<String, Integer>> getMaxEntry = gradesForStudents.entrySet();
        Map.Entry<String, Integer> maxEntry = null;
        Integer max = Collections.max(gradesForStudents.values());

        for (Map.Entry<String, Integer> entry : gradesForStudents.entrySet()) {
            Integer value = entry.getValue();
            if (null != value && max == value) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry.getValue());

    }
}