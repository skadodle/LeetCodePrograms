package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseIntegerTest {
    @Test
    public void testCase1() {
        assertEquals(321, ReverseInteger.reverse(123));
    }

    @Test
    public void testCase2() {
        assertEquals(-321, ReverseInteger.reverse(-123));
    }

    @Test
    public void testCase3() {
        assertEquals(21, ReverseInteger.reverse(120));
    }
    
    @Test
    public void testCase4() {
        assertEquals(0, ReverseInteger.reverse(1534236469));
    }
}