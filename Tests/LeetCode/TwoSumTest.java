package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    @Test
    public void testCase1() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.solution(new int[]{2, 7, 11, 15}, 9));
    }

}