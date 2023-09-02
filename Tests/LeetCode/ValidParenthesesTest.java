package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
    @Test
    public void testCase1() {
        assertTrue(ValidParentheses.isValidStack(""));
    }

    @Test
    public void testCase2() {
        assertTrue(ValidParentheses.isValidStack("(){}[]"));
    }

    @Test
    public void testCase3() {
        assertTrue(ValidParentheses.isValidStack("({[]})"));
    }

    @Test
    public void testCase4() {
        assertFalse(ValidParentheses.isValidStack("([)]"));
    }
}