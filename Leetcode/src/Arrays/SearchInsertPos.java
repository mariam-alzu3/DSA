package Arrays;

//solved omo
public class SearchInsertPos {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        //searchInsert(nums, target);
        searchInsert2(nums, target);
    }

    // approach #1
    public static int searchInsert(int[] nums, int target) {
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                break;
            } else if (target < nums[i]) {
                break;
            } else if (target > nums[nums.length - 1]) {
                i = nums.length;
                break;
            }
        }
        System.out.println(i);
        return i;
    }

    //approach #2 - O(log(n))
    public static int searchInsert2(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (target == nums[mid]) {
                System.out.println(mid);
                return mid;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else if (target < nums[mid]) {
                r = mid - 1;
            }
        }
        System.out.println(l);
        return l;
    }

}

