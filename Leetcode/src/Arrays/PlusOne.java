package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9};
        plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return digits;

            } else if (digits[i] == 9) {
                digits[i] = 0;
                System.out.println(Arrays.toString(digits));
            }
        }

        int[] newArr = new int[digits.length+1];
        newArr[0] = 1;
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
}
