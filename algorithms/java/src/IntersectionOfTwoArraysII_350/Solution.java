package IntersectionOfTwoArraysII_350;

import java.util.ArrayList;
import java.util.TreeMap;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (treeMap.containsKey(nums1[i]))
                treeMap.put(nums1[i], treeMap.get(nums1[i]) + 1);
            else
                treeMap.put(nums1[i], 1);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (treeMap.containsKey(nums2[i])) {
                arrayList.add(nums2[i]);
                treeMap.put(nums2[i], treeMap.get(nums2[i]) - 1);
                if (treeMap.get(nums2[i]) == 0)
                    treeMap.remove(nums2[i]);
            }
        }

        int[] ret = new int[arrayList.size()];
        for (int i = 0; i < ret.length; i++)
            ret[i] = arrayList.get(i);

        return ret;
    }
}
