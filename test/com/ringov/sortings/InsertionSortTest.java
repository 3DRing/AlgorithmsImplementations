package com.ringov.sortings;

import com.ringov.TestDatasets;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ringov on 05.07.17.
 */
public class InsertionSortTest {
    @Test
    public void simpleSortingWithComparable() {
        Integer[] arr = TestDatasets.simpleUnsortedIntegerArrayA1;
        InsertionSort.sort(arr);

        Integer[] check = TestDatasets.simpleSortedIntegerArrayA1;
        for (int i = 0; i < arr.length; i++) {
            assertTrue(arr[i].equals(check[i]));
        }
    }

    @Test
    public void simpleSortingWithComparator() {
        Integer[] arr = TestDatasets.simpleUnsortedIntegerArrayA1;
        InsertionSort.sort(arr, (t1, t2) -> {
            if (t1 > t2) {
                return -1;
            }
            if (t1 < t2) {
                return 1;
            }
            return 0;
        });
        Integer[] check = TestDatasets.simpleSortedIntegerArrayA1;
        for (int i = 0; i < arr.length; i++) {
            assertTrue(arr[i].equals(check[(arr.length - 1) - i]));
        }
    }

    // todo test sorting of other types with other conditions
}