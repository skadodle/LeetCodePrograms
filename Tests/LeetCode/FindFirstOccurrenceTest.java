package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstOccurrenceTest {
    @Test
    public void testCase1() {
        assertEquals(0, FindFirstOccurrence.strStr("sadbutsad", "sad"));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, FindFirstOccurrence.strStr("leetcode", "leeto"));
    }
}