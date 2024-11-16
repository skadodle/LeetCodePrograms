package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtoiTest {

    @Test
    public void testCase1() {
        assertEquals(42, Atoi.myAtoi("42"));
        assertEquals(-42, Atoi.myAtoi("   -042"));
        assertEquals(1337, Atoi.myAtoi("1337c0d3"));
        assertEquals(0, Atoi.myAtoi("0-1"));
        assertEquals(0, Atoi.myAtoi("words and 987"));
    }

    @Test
    public void testCase2() {
        assertEquals(3, Atoi.myAtoi("3.14159"));
        assertEquals(11, Atoi.myAtoi("11.7811"));
        assertEquals(-2, Atoi.myAtoi("-2.15577"));
    }

    @Test
    public void testCase3() {
        assertEquals(0, Atoi.myAtoi("   +0 123"));
    }

    @Test
    public void testCase4() {
        assertEquals(Integer.MAX_VALUE, Atoi.myAtoi("9223372036854775808"));
        assertEquals(Integer.MAX_VALUE, Atoi.myAtoi("18446744073709551617"));
    }

    @Test
    public void testCase5() {
        assertEquals(0, Atoi.myAtoi("+-12"));
    }
}