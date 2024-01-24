package LeetCode;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val) {
                count++;
                nums[i] = -1;
            }
        }

        count = nums.length - count;

        int[] array = Arrays.copyOf(nums, nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (array[i] != -1)
                nums[index++] = array[i];
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = -1;
        }

        return count;
    }
}
