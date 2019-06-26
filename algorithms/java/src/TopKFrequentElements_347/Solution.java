package TopKFrequentElements_347;

import java.util.*;

public class Solution {

    class Freq {

        int e, freq;

        public Freq(int e, int freq) {
            this.e = e;
            this.freq = freq;
        }
    }

    /*class Freq implements Comparable<Freq> {

        int e, freq;

        public Freq(int e, int freq) {
            this.e = e;
            this.freq = freq;
        }

        @Override
        public int compareTo(Freq anther) {

            if (this.freq < anther.freq)
                return -1;
            else if (this.freq > anther.freq)
                return 1;
            else {
                return 0;
            }
        }

    }*/


    class FreqComparator implements Comparator<Freq> {

        @Override
        public int compare(Freq o1, Freq o2) {
            return o1.freq - o2.freq;
        }
    }


    public List<Integer> topKFrequent(int[] nums, int k) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Freq> pq = new PriorityQueue<>(new FreqComparator());
        map.keySet().forEach(key -> {

            if (pq.size() < k) {
                pq.add(new Freq(key, map.get(key)));
            } else if (map.get(key) > pq.peek().freq) {
                pq.remove();
                pq.add(new Freq(key, map.get(key)));
            }

        });

        LinkedList<Integer> list = new LinkedList<>();
        while (pq.size() > 0)
            list.add(pq.remove().e);
        return list;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(new Solution().topKFrequent(nums, 2));
    }
}