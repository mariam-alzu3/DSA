package Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        getConcatenation(nums);
    }

    public static int[] getConcatenation(int[] nums) {
        //my sol
//        int[] ans = new int[2 * nums.length];
//
//        System.arraycopy(nums, 0, ans, 0, nums.length);
//        System.arraycopy(nums, 0, ans, nums.length, nums.length);
//        System.out.println(Arrays.toString(ans));
//        return ans;
//    }

        //another solution
        int ans[] = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
