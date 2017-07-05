package com.ringov;

/**
 * Created by ringov on 04.07.17.
 */
public class Utils {
    public static void swap(Comparable[] array, int i1, int i2) {
        Comparable tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;
    }
}
