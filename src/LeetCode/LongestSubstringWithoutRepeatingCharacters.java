package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int length(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String is null!");
        }
        if (s.isEmpty())
            return 0;

        String temp = "";
        int maxLength = 0;

        for (char symbol : s.toCharArray()) {
            temp += symbol + "";
            while (!isDistinctString(temp)) {
                temp = temp.substring(1);
            }
            if (temp.length() > maxLength)
                maxLength = temp.length();
        }
        return maxLength;
    }

    private static boolean isDistinctString(String str) {
        Set<Character> set = new HashSet<>();
        for (char symbol : str.toCharArray()) {
            if (!set.add(symbol))
                return false;
        }
        return true;
    }
}
