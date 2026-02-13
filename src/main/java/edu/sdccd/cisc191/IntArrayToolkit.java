package edu.sdccd.cisc191;
import java.util.Arrays;
/**
 * Module 1 - Part A
 * Utility methods for working with int[].
 *
 * IMPORTANT:
 * - Do not print inside these methods.
 * - Do not modify input arrays unless the method explicitly says so.
 */
public class IntArrayToolkit {
    /**
     * Returns the sum of all values in the array.
     * @throws IllegalArgumentException if a is null
     */
    public static int sum(int[] a) {
        // TODO: implement
        if (a == null) {
            throw new IllegalArgumentException("a cannot be null");
        }
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }

    /**
     * Returns the maximum value in the array.
     * @throws IllegalArgumentException if a is null or empty
     */
    public static int max(int[] a) {
        // TODO: implement
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("a cannot be null");
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    /**
     * Returns the index of the first occurrence of target, or -1 if not found.
     * @throws IllegalArgumentException if a is null
     */
    public static int indexOf(int[] a, int target) {
        // TODO: implement
        if (a == null) {
            throw new IllegalArgumentException("a cannot be null");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i; // Found it, return current index
            }
        }
        return -1;
    }

    /**
     * Returns a NEW array containing the same values as a, sorted ascending.
     * Must not modify the original array.
     * @throws IllegalArgumentException if a is null
     */
    public static int[] copySortedAscending(int[] a) {
        // TODO: implement (hint: defensive copy + Arrays.sort)
        if (a == null) {
            throw new IllegalArgumentException("a cannot be null");
        }
        int[] sortedCopy = Arrays.copyOf(a, a.length);
        Arrays.sort(sortedCopy);
        return sortedCopy;
    }
}
