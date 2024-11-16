package LeetCode;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol        Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together.
12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right.
However, the numeral for four is not IIII. Instead, the number four is written as IV.
Because the one is before the five we subtract it making four. The same principle applies
to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
*/

import java.util.regex.Pattern;

public class RomanToInteger {
    public static int romanToInt(String s) throws IllegalArgumentException {
        if (s == null || s.isEmpty() || s.length() > 15) throw new IllegalArgumentException();
        if (!Pattern.matches("[IVXLCDM]+", s)) return -1;
        int result = 0;
        char[] str = s.toCharArray();
        boolean subStracted;
        for (int i = str.length - 1; i >= 0; i = i - (1 + (subStracted ? 1 : 0))) {
            subStracted = false;
            if (str[i] == 'I') result += 1;
            else if (i != 0 && str[i] == 'V' && str[i - 1] == 'I') {
                result += 4;
                subStracted = true;
            }
            else if (i != 0 && str[i] == 'X' && str[i - 1] == 'I') {
                result += 9;
                subStracted = true;
            }
            else if (i != 0 && str[i] == 'L' && str[i - 1] == 'X') {
                result += 40;
                subStracted = true;
            }
            else if (i != 0 && str[i] == 'C' && str[i - 1] == 'X') {
                result += 90;
                subStracted = true;
            }
            else if (i != 0 && str[i] == 'D' && str[i - 1] == 'C') {
                result += 400;
                subStracted = true;
            }
            else if (i != 0 && str[i] == 'M' && str[i - 1] == 'C') {
                result += 900;
                subStracted = true;
            }
            else if (str[i] == 'V') result += 5;
            else if (str[i] == 'X') result += 10;
            else if (str[i] == 'L') result += 50;
            else if (str[i] == 'C') result += 100;
            else if (str[i] == 'D') result += 500;
            else if (str[i] == 'M') result += 1000;
        }
        return result;
    }
}
