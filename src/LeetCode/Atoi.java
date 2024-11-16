package LeetCode;

public class Atoi {
    public static int myAtoi(final String s) {
        String str = (s.trim().replaceAll("(\\s+)", " ")).split(" ")[0];
        double result = 0;
        boolean negative = false;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                if (str.charAt(i) == '-') {
                    negative = true;
                    continue;
                }
                else if (str.charAt(i) == '+') {
                    continue;
                }
                else if (notIsNumber(str.charAt(0)))
                    return 0;
            }
            if (notIsNumber(str.charAt(i)))
                break;

            result = result * 10 + str.charAt(i) - '0';
        }

        result = negative ? -result : result;
        return returnValue(result, negative);
    }

    private static boolean notIsNumber(final char chr) {
        return chr < '0' || chr > '9';
    }

    private static int returnValue(final double result, final boolean negative) {
        int value = (int) result;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            value = negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return value;
    }
}
