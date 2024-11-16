package LeetCode;

public class FindFirstOccurrence {
    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            int index = 0;
            while (i + index != haystack.length() && index != needle.length() && haystack.charAt(i + index) == needle.charAt(index)) {
                index++;
            }
            if (index == needle.length()) return i;
        }
        return -1;
    }
}
