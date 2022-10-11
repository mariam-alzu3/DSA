package Arrays;

//review
import java.util.Arrays;

public class RemoveDuplicatesSortedArr {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int l = 1;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != nums[r - 1]) {
                nums[l] = nums[r];
                l += 1;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(l);
        return l;
    }
}
