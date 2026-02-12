package edu.sdccd.cisc191;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Module 1 - Part C
 * Utility methods for working with Student[].
 *
 * IMPORTANT:
 * - Methods that return Student[] must return NEW arrays (defensive copy).
 * - For sorting, use a Comparator created with a lambda or method references.
 */
public class StudentArrayToolkit {

    /**
     * Returns a NEW array sorted by:
     * 1) GPA descending
     * 2) name ascending (tie-breaker)
     *
     * Must not modify the original array.
     */
    public static Student[] copySortedByGpaDesc(Student[] students) {
        // TODO: defensive copy + Arrays.sort with Comparator lambda
        if (students == null) {
            throw new IllegalArgumentException("Student array cannot be null");
        }
        Student[] sortedStudents = Arrays.copyOf(students, students.length);

        Arrays.sort(sortedStudents, (s1, s2) -> {
            int gpaCompare = Double.compare(s2.getGpa(), s1.getGpa());

            if (gpaCompare != 0) {
                return gpaCompare;
            }
            return s1.getName().compareTo(s2.getName());
        });
        return sortedStudents;
    }

    /**
     * Linear search for a student by id.
     * Returns the Student if found, otherwise null.
     */
    public static Student findByIdLinear(Student[] students, int id) {
        // TODO: implement
        if (students == null) {
            throw new IllegalArgumentException("Student array cannot be null.");
        }
        for (Student s : students) {
            if (s != null && s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    /**
     * Returns a NEW array containing the top N students by GPA desc (ties: name asc).
     * If n > students.length, return all students (sorted).
     * If n == 0, return an empty array.
     * @throws IllegalArgumentException if n < 0
     */
    public static Student[] topNByGpa(Student[] students, int n) {
        // TODO: validate n, sort copy, return first n in a new array
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }

        if (students == null) {
            throw new IllegalArgumentException("Student array cannot be null");
        }

        Student[] sortedAll = copySortedByGpaDesc(students);

        int resultSize = Math.min(n, sortedAll.length);

        return Arrays.copyOf(sortedAll, resultSize);
    }
}
