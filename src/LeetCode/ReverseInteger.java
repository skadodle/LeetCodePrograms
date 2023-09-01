package LeetCode;

/* example
* IN -> OUT
* 123 -> 321
* -123 -> -321
* 120 -> 21
*/

public class ReverseInteger {
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        long ans = 0;
        x = Math.abs(x);
        while(x != 0) {
            ans = ans * 10 + x % 10;
            if (ans != (int)ans)
                return 0;
            x /= 10;
        }
        return (int)ans * (isNegative ? -1 : 1);
    }
}
