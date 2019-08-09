package IntersectionOfTwoArrays_349;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 * <p>
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums1.length; i++)
            treeSet.add(nums1[i]);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (treeSet.contains(nums2[i])) {
                arrayList.add(nums2[i]);
                treeSet.remove(nums2[i]);
            }
        }

        int[] ret = new int[arrayList.size()];
        for (int i = 0; i < ret.length; i++)
            ret[i] = arrayList.get(i);
        return ret;
    }

}
