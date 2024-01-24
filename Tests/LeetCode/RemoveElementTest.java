package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    @Test
    public void TestCase1() {
        int[] array1 = new int[]{3, 2, 2, 3};
        assertEquals(2, RemoveElement.removeElement(array1, 3));
    }

    @Test
    public void TestCase2() {
        int[] array = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        assertEquals(5, RemoveElement.removeElement(array, 2));
    }
}