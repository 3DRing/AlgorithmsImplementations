package com.ringov;

import com.ringov.sortings.InsertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = {2, 5, 6, 1, 3};

        System.out.println(Arrays.toString(arr));

        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
