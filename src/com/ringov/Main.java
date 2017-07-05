package com.ringov;

import com.ringov.sortings.InsertionSort;
import com.ringov.sortings.MergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = {2, 5, 6, 1, 3};

        System.out.println(Arrays.toString(arr));

        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
