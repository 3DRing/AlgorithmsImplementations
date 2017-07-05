package com.ringov.sortings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ringov on 05.07.17.
 */
public class InsertionSortTest {
    @Test
    public void simpleSorting() {
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

    // todo test sorting of other types with other conditions
}