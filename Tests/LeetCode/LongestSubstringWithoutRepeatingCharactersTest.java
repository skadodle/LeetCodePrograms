package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void testCase1() {
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.length("abcabcbb"));
    }

    @Test
    public void testCase2() {
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters.length("bbbbb"));
    }

    @Test
    public void testCase3() {
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.length("pwwkew"));
    }
}