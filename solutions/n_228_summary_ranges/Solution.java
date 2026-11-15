package n_228_summary_ranges;

//228. Summary Ranges
//https://leetcode.com/problems/summary-ranges

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    static void main() {
        System.out.println(summaryRanges(new int[] {0,1,2,4,5,7}));
        System.out.println(summaryRanges(new int[] {0,2,3,4,6,8,9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return Collections.emptyList();

        int st = nums[0];
        int lt = nums[0];
        List<String> rs = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if (lt + 1 == nums[i]) {
                lt = nums[i];
            } else {
                if (st == lt) {
                    rs.add(String.valueOf(st));
                } else {
                    rs.add(st + "->" + lt);
                }
                st = nums[i];
                lt = nums[i];
            }
        }

        if (st == lt) {
            rs.add(String.valueOf(st));
        } else {
            rs.add(st + "->" + lt);
        }

        return rs;
    }
}
