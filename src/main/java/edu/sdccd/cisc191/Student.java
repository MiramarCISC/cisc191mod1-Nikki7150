package edu.sdccd.cisc191;

/**
 * Module 1 - Part B
 * Student data model with validation.
 */
public class Student {

    private final String name;
    private final double gpa;
    private final int id;

    /**
     * Validation rules:
     * - name must not be null or blank
     * - gpa must be in [0.0, 4.0]
     * - id must be > 0
     *
     * @throws IllegalArgumentException if any argument is invalid
     */
    public Student(String name, double gpa, int id) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0");
        }

        this.name = name;
        this.gpa = gpa;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s', gpa=%.2f}", id, name, gpa);
    }
}