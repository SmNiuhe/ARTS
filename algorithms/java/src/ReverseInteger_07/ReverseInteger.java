package ReverseInteger_07;

/**
 * @description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * <p>
 * Integer.MAX_VALUE x
 * Integer.MIN_VALUE -2147483648
 * @author: smniuhe
 * @Date: 18:09 2019-04-22
 */
public class ReverseInteger {

    public static int reverse(int x) {

        int reverse = 0;
        int pop;

        while (x != 0) {

            pop = x % 10;
            x /= 10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && pop > 7)) {
                return 0;
            }

            if (reverse < (Integer.MIN_VALUE / 10) || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            reverse = reverse * 10 + pop;
        }
        return reverse;
    }

}
