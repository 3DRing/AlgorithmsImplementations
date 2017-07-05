package com.ringov.sortings;

/**
 * Created by ringov on 04.07.17.
 */
public class InsertionSort {

    public static void sort(Comparable[] array) {
        for (int i = 1; i < array.length; i++) {
            Comparable key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

}
