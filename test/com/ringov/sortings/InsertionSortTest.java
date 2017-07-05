package com.ringov.sortings;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * Created by ringov on 05.07.17.
 */
public class InsertionSortTest {
    @Test
    public void simpleSortingWithComparable() {
        Integer[] arr = {6, 2, 8, 3, 9, 4, 5, 0};
        InsertionSort.sort(arr);
        assertTrue(arr[0] == 0);
        assertTrue(arr[1] == 2);
        assertTrue(arr[2] == 3);
        assertTrue(arr[3] == 4);
        assertTrue(arr[4] == 5);
        assertTrue(arr[5] == 6);
        assertTrue(arr[6] == 8);
        assertTrue(arr[7] == 9);
    }

    @Test
    public void simpleSortingWithComparator() {
        Integer[] arr = {6, 2, 8, 3, 9, 4, 5, 0};
        InsertionSort.sort(arr, (t1, t2) -> {
            if (t1 > t2) {
                return -1;
            }
            if (t1 < t2) {
                return 1;
            }
            return 0;
        });
        assertTrue(arr[7] == 0);
        assertTrue(arr[6] == 2);
        assertTrue(arr[5] == 3);
        assertTrue(arr[4] == 4);
        assertTrue(arr[3] == 5);
        assertTrue(arr[2] == 6);
        assertTrue(arr[1] == 8);
        assertTrue(arr[0] == 9);
    }

    // todo test sorting of other types with other conditions
}