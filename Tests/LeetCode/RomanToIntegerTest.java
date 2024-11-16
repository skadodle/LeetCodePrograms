package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    @Test
    public void testCase1() {
        assertEquals(3, RomanToInteger.romanToInt("III"));
        assertEquals(4, RomanToInteger.romanToInt("IV"));
        assertEquals(58, RomanToInteger.romanToInt("LVIII"));
        assertEquals(1994, RomanToInteger.romanToInt("MCMXCIV"));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, RomanToInteger.romanToInt("BDAA"));
        assertEquals(-1, RomanToInteger.romanToInt("MZMZA"));
        assertEquals(-1, RomanToInteger.romanToInt("XVMAA"));
    }
}