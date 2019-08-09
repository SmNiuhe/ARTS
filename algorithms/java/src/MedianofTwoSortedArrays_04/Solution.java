package MedianofTwoSortedArrays_04;

/**
 * @description:
 * @author: smniuhe
 * @Date: 18:49 2019-08-07
 * <p>
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 则中位数是 2.0
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 则中位数是 (2 + 3)/2 = 2.5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0, j = 0, k = 0;
        int q = nums1.length - 1, r = nums2.length - 1;
        int[] tmp = new int[q + r + 2];

        while (i <= q && j <= r) {
            if (nums1[i] <= nums2[j]) {
                tmp[k++] = nums1[i++]; // i++ 等于 i:=i+1
            } else {
                tmp[k++] = nums2[j++];
            }
        }

        int start = i, end = q;

        // 判断哪个子数组中有剩余的数据
        if (j <= r) {
            start = j;
            end = r;
            // 将剩余的数据拷贝到临时数组 tmp
            while (start <= end) {
                tmp[k++] = nums2[start++];
            }
        } else {
            while (start <= end) {
                tmp[k++] = nums1[start++];
            }
        }


        int median = k / 2;
        if (k % 2 == 0) {
            return (tmp[median - 1] + tmp[median]) / 2.0D;
        }
        return tmp[median] * 1.0D;

    }


    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        // int[] nums1 = {1, 2};
        // int[] nums2 = {3, 4};

        double medianNum = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianNum);
    }

}
