package edu.sdccd.cisc191;

import static edu.sdccd.cisc191.StudentArrayToolkit.*;

/**
 * Module 1 - Demo runner.
 * This is primarily for your video demo.
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.5, 101),
                new Student("Charlie", 3.8, 102),
                new Student("Bob", 3.8, 103), // Same GPA as Charlie, name starts with B
                new Student("David", 3.2, 104),
                new Student("Eve", 4.0, 105),
                new Student("Frank", 2.9, 106)
        };
        System.out.println("--- Original Order ---");
        for (Student s : students) System.out.println(s);
        System.out.println("\n--- Sorted by GPA (Descending, Name Ascending Tie-breaker) ---");
        Student[] sorted = copySortedByGpaDesc(students);
        for (Student s : sorted) System.out.println(s);
        System.out.println("\n--- Top 3 Students ---");
        Student[] top3 = topNByGpa(students, 3);
        for (Student s : top3) System.out.println(s);
        System.out.println("\n--- Search Results ---");
        Student found = findByIdLinear(students, 105);
        System.out.println("Searching for ID 105: " + (found != null ? found : "Not Found"));
        Student notFound = findByIdLinear(students, 999);
        System.out.println("Searching for ID 999: " + (notFound != null ? notFound : "Not Found"));
    }
}
