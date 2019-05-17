package RemoveDuplicatesfromSortedArray_26;

import java.util.Arrays;

/**
 * @description: @https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * @author: smniuhe
 * @Date: 15:19 2019-05-17
 */
public class Solution {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    public static void main(String[] args) {


        int[] nums1 = new int[]{1, 1, 2};
        int[] nums2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("长度：" + removeDuplicates(nums1) + "，removeDuplicates after：" + Arrays.toString(nums1));
        System.out.println("长度：" + removeDuplicates(nums2) + "，removeDuplicates after：" + Arrays.toString(nums2));
    }
}
