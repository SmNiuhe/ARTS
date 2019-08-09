package ThreeSum_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public static List<List<Integer>> threeSum(int[] nums) {


        ArrayList<List<Integer>> retContainer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

        }
        return retContainer;
    }


    public static void main(String[] args) {

        /*int[] v1 = {-1, 0, 1};
        int[] v2 = {-1, -1, 2};

        String s1 = Arrays.toString(v1);
        String s2 = Arrays.toString(v2);

        System.out.println(s1);
        System.out.println(s2);

        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums).forEach(list -> {
            System.out.println(list.toString());
        });*/
        Integer a = 1;
        Integer c = 2;
        Integer b = new Integer(3);
        System.out.println(a + c == b);

    }

}
