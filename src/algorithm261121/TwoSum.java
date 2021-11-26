package algorithm261121;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {3, 2, 3};
        int target = 6;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+ 1; j < nums.length; j++) {
                int aa = nums[i] + nums[j];
                if (aa == target) {
                    arr[0] = i;
                    arr[1] = j;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}