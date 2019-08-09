package ContainerWithMostWater_11;

import org.junit.Assert;

/**
 * @description:
 * @author: smniuhe
 * @Date: 12:01 2019-08-08
 * <p>
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 */
public class Solution {

    public static int maxArea(int[] height) {

        int maxArea = 0;
        int len = height.length;
        int width$ = 0, height$ = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {

                // 求出宽高
                width$ = j - i;
                height$ = height[j];
                if (height[i] <= height[j])
                    height$ = height[i];

                if (width$ * height$ > maxArea)
                    maxArea = width$ * height$;
            }
        }
        return maxArea;
    }


    public static void main(String[] args) {

        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int output = maxArea(input);
        System.out.println(output);
        Assert.assertEquals(49, output);

    }

}
