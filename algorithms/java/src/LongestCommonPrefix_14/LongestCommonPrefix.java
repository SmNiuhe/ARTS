package LongestCommonPrefix_14;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length < 1) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        // 寻找最短的链
        int minimumIndex = 0;
        int minimumLength = strs[minimumIndex].length();
        String longestCommonPrefix = "";
        String longestCommonPrefixTemp = "";
        for (int i = 1; i < strs.length; i++) {

            if (strs[i].length() < minimumLength) {
                minimumLength = strs[i].length();
                minimumIndex = i;
            }
        }


        // 以最短链去匹配公共前缀
        String demo = strs[minimumIndex];
        for (int i = 0; i < demo.length(); i++) {

            longestCommonPrefixTemp += demo.substring(i, i + 1);

            for (int j = 0; j < strs.length; j++) {

                if (minimumIndex == j)
                    continue;
                if (!strs[j].contains(longestCommonPrefixTemp)) {
                    longestCommonPrefixTemp = longestCommonPrefixTemp.substring(0, longestCommonPrefixTemp.length() - 1);
                    if (longestCommonPrefixTemp.length() > longestCommonPrefix.length())
                        longestCommonPrefix = longestCommonPrefixTemp;
                    longestCommonPrefixTemp = "";
                    break;
                } else {
                    longestCommonPrefix = longestCommonPrefixTemp;
                }
            }
        }
        return longestCommonPrefix;
    }


    public static String longestCommonPrefix2(String[] strs) {

        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }


    public static void main(String[] args) {

        String prefix = "xx";
        String num = "abfeifje";
        int i = num.indexOf(prefix);
        System.out.println(i);
    }

}
