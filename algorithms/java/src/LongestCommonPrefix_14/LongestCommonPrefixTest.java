package LongestCommonPrefix_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {


        String[] strs1 = {"flower", "flow", "flight"};
        // String[] strs2 = {"dog", "racecar", "car"};
        // String[] strs3 = {"a"};
        // String[] strs4 = {"c", "c"};

        String s = LongestCommonPrefix.longestCommonPrefix(strs1);
        // String s = LongestCommonPrefix.longestCommonPrefix(strs2);
        // String s = LongestCommonPrefix.longestCommonPrefix(strs3);
        // String s = LongestCommonPrefix.longestCommonPrefix(strs4);
        System.out.println(s);

    }
}