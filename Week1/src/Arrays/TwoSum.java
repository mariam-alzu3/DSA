package Arrays;
//review q
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        //declare array and target
        int[] numsArr = {3, 5, 2, 4};
        int targetNum = 6;
        twoSum(numsArr, targetNum);
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] ans = {i, j};
                    System.out.println(Arrays.toString(ans));
                    return ans;
                }
            }
        }
        System.out.println("No combo found");
        return null;
    }
}
