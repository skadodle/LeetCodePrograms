package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTest {
    @Test
    public void testCase1() {
        assertTrue(ContainsDuplicate.isNotDistinctByHashSet(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void testCase2() {
        assertFalse(ContainsDuplicate.isNotDistinctByHashSet(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testCase3() {
        assertTrue(ContainsDuplicate.isNotDistinctByHashSet(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}