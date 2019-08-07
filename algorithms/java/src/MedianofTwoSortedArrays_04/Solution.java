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


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0, j = 0, k = 0;
        int q = nums1.length, r = nums2.length;
        int[] tmp = new int[q + r];

        while (i <= q && j <= r) {
            if (nums1[i] <= nums2[j]) {
                tmp[k++] = nums1[i++]; // i++ 等于 i:=i+1
            } else {
                tmp[k++] = nums2[j++];
            }
        }

        // 判断哪个子数组中有剩余的数据
        int start = i, end = q;

        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组 tmp
        while (start <= end) {
            tmp[k++] = A[start++];
        }


        // 将 tmp 中的数组拷贝回 A[p...r]
        for (int z = 0; z <= r - p; z++) {
            A[p + z] = tmp[z];
        }

        return 1D;
    }


    private void merge(int[] A, int p, int q, int r) {

        int i = p, j = q + 1, k = 0;  // 初始化变量 i, j, k
        int[] tmp = new int[A.length];  // 申请一个大小跟 A[p...r] 一样的临时数组
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[k++] = A[i++]; // i++ 等于 i:=i+1
            } else {
                tmp[k++] = A[j++];
            }
        }

        // 判断哪个子数组中有剩余的数据
        int start = i, end = q;

        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组 tmp
        while (start <= end) {
            tmp[k++] = A[start++];
        }


        // 将 tmp 中的数组拷贝回 A[p...r]
        for (int z = 0; z <= r - p; z++) {
            A[p + z] = tmp[z];
        }
    }
}
