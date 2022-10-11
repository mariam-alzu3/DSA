package Arrays;

//solved omo

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        removeElement(nums, val);
    }

    public static int removeElement(int[] nums, int val) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer] = nums[i];
                pointer +=1;
                System.out.println("found");
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(pointer);
        return pointer;
    }
}
