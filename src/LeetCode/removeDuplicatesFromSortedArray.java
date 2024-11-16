package LeetCode;

public class removeDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int num = nums[0];
        int currentIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (num != nums[i]) {
                num = nums[i];
                nums[currentIndex++] = num;
            }
        }
        return currentIndex;
    }
}
