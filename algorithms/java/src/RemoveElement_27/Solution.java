package RemoveElement_27;

import java.util.Arrays;

/**
 * @description: @https://leetcode-cn.com/problems/remove-element/
 * @author: smniuhe
 * @Date: 16:37 2019-05-17
 * 示例 1:
 * <p>
 * 给定 nums = [3,2,2,3], val = 3,
 * <p>
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * <p>
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * <p>
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * <p>
 * 注意这五个元素可为任意顺序。
 * <p>
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public static int removeElement(int[] nums, int val) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args) {


        // int[] nums1 = new int[]{3, 2, 2, 3};
        int[] nums2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};


        // System.out.println("长度：" + removeElement(nums1, 3) + "，removeDuplicates after：" + Arrays.toString(nums1));
        System.out.println("长度：" + removeElement(nums2, 2) + "，removeDuplicates after：" + Arrays.toString(nums2));
    }

}
