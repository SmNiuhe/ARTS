package TwoSum;


import org.junit.Assert;
import org.junit.Test;

/**
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSumTest {

    /**
     * 执行用时 : 35 ms, 在Two Sum的Java提交中击败了49.02% 的用户
     * 内存消耗 : 38.7 MB, 在Two Sum的Java提交中击败了0.99% 的用户
     */
    @Test
    public void testTowSum() {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] actuals = TwoSum.twoSum(nums, target);
        int[] expecteds = {0, 1};
        Assert.assertArrayEquals(expecteds, actuals);
    }

}
