package Arrays;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        containsDup(nums);
    }

    public static boolean containsDup(int[] nums){
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }
        System.out.println(numbers);
        return false;
    }
}
