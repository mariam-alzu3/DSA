package Arrays;

import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        missingNum(nums);
    }

    public static int missingNum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
