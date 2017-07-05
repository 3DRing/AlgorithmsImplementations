package com.ringov;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by ringov on 04.07.17.
 */
public class UtilsTest {

    @Test
    public void swapingIntegers() {
        Integer[] arr = {3, 4};
        Utils.swap(arr, 0, 1);
        assertTrue(arr[0] == 4);
        assertTrue(arr[1] == 3);
    }

    @Test
    public void swapingCustomComparable() {
        TestComparable[] arr = {new TestComparable(TestComparable.VALUE.VAL1), new TestComparable(TestComparable.VALUE.VAL2)};
        Utils.swap(arr, 0, 1);
        assertTrue(arr[0].val == TestComparable.VALUE.VAL2);
        assertTrue(arr[1].val == TestComparable.VALUE.VAL1);
    }

    // todo test exceptions

    private static class TestComparable implements Comparable {

        public enum VALUE {VAL1, VAL2, VAL3}

        private VALUE val;

        TestComparable(VALUE val) {
            this.val = val;
        }

        @Override
        public int compareTo(Object o) {
            if (!(o instanceof TestComparable)) {
                throw new IllegalStateException("Object " + o.toString() + " must be TestComparable!");
            }
            switch (((TestComparable) o).val) {
                case VAL1:
                    switch (this.val) {
                        case VAL1:
                            return 0;
                        case VAL2:
                        case VAL3:
                            return -1;
                    }
                case VAL2:
                    switch (this.val) {
                        case VAL1:
                            return 1;
                        case VAL2:
                            return 0;
                        case VAL3:
                            return -1;
                    }
                case VAL3:
                    switch (this.val) {
                        case VAL1:
                            return 1;
                        case VAL2:
                            return 1;
                        case VAL3:
                            return 0;
                    }
                default:
                    return 0;
            }
        }
    }
}