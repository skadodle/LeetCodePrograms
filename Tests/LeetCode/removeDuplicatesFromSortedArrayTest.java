package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void testCase1() {
        int[] array = new int[]{1, 2};
        int[] expected = new int[]{1, 1, 2};
        assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(expected));
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(array, Arrays.copyOf(expected, 2));
    }

    @Test
    public void testCase2() {
        int[] array = new int[]{0, 1, 2, 3, 4};
        int[] expected = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(expected));
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(array, Arrays.copyOf(expected, 5));
    }
}