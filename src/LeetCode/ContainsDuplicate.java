package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean isNotDistinctByStreams(int[] nums) {
        return Arrays.stream(nums)
                .distinct()
                .count() != nums.length;
    }

    public static boolean isNotDistinctByHashSet(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;
    }
}
