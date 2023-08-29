package LeetCode;

import java.util.HashMap;

public class TwoSum {
    public static int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // num, index

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            else
                map.put(nums[i], i);
        }
        return null;
    }
}
