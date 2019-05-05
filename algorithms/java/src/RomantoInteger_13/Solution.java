package RomantoInteger_13;

import java.util.HashMap;

/**
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 */
public class Solution {

    public static int romanToInt(String s) {

        String minimum = "I";
        String maximum = "MMMCMXCIX";


        HashMap<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        roman.put("MMMCMXCIX", 3999);
        Integer sum = 0;

        for (int i = 0; i < s.length(); i++) {

            String curSymbol = s.substring(i, i + 1);
            Integer curValue = roman.get(curSymbol);
            String nextSymbol;
            Integer nextValue;
            if (i == s.length() - 1) {
                sum += curValue;
                return sum;
            }

            nextSymbol = s.substring(i + 1, i + 2);
            nextValue = roman.get(nextSymbol);

            if (curValue >= nextValue) {
                sum += curValue;
            } else {
                sum += nextValue - curValue;
                i++;
            }
        }

        return sum;
    }

}
