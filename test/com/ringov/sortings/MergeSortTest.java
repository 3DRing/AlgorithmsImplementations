package com.ringov.sortings;

import com.ringov.TestDatasets;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ringov on 05.07.17.
 */
public class MergeSortTest {
    @Test
    public void simpleSortingWithComparable() {
        Integer[] arr = TestDatasets.simpleUnsortedIntegerArrayA1;
        MergeSort.sort(arr);

        Integer[] check = TestDatasets.simpleSortedIntegerArrayA1;
        for (int i = 0; i < arr.length; i++) {
            assertTrue(arr[i].equals(check[i]));
        }
    }
}