package Arrays;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int[] nums1 = {1, 0, 1};

        singleNum(nums);
        singleNum(nums1);
    }

    public static int singleNum(int[] nums) {
        Arrays.sort(nums);
        int p = 0;
        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 < nums.length && nums[p] != nums[i + 1]) {

            } else if (i + 1 < nums.length && nums[p] == nums[i + 1]) {
                p += 2;
            }

        }
        System.out.println(nums[p]);
        return nums[p];
    }
}
