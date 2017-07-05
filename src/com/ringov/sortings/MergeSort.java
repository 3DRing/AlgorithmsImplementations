package com.ringov.sortings;

/**
 * Created by ringov on 05.07.17.
 */
public class MergeSort {

    public static void sort(Comparable[] array) {
        mergeSort(array, 0, array.length);
    }

    private static void mergeSort(Comparable[] array, int p, int r) {
        if (r - p > 1) {
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q, r);
            merge(array, p, q, r);
        }
    }

    private static void merge(Comparable[] array, int p, int q, int r) {
        int n1 = q - p;
        int n2 = r - q;
        Comparable[] left = new Comparable[n1];
        Comparable[] right = new Comparable[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = array[p + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = array[q + i];
        }
        int i = 0;
        int j = 0;
        for (int k = p; k < r; k++) {
            if (i < left.length && j < right.length) {
                if (left[i].compareTo(right[j]) <= 0) {
                    array[k] = left[i];
                    i++;
                } else {
                    array[k] = right[j];
                    j++;
                }
            } else {
                if (i < left.length) {
                    array[k] = left[i];
                    i++;
                } else {
                    array[k] = right[j];
                    j++;
                }
            }
        }
    }
}
