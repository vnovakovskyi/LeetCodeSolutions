package n_163_missing_ranges;

//163. Missing Ranges
//https://leetcode.com/problems/missing-ranges

import java.util.ArrayList;
import java.util.List;

class Solution {

    static void main() {
//        List<List<Integer>> res = findMissingRanges(new int[]{4, 5, 8, 67, 69, 94}, 0, 100);
//        List<List<Integer>> res = findMissingRanges(new int[]{-1}, -1, -1);
//        List<List<Integer>> res = findMissingRanges(new int[]{}, 1, 1);
//        List<List<Integer>> res = findMissingRanges(new int[]{}, 0, 5);
        List<List<Integer>> res = findMissingRanges(new int[]{4,5}, 0, 10);
//        List<List<Integer>> res = findMissingRanges(new int[]{1}, 0, 1);
//        List<List<Integer>> res = findMissingRanges(new int[]{0}, 0, 1);
        System.out.println(res);
    }

    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> range = new ArrayList<>();

        int last = lower;
        int curr;

        if (nums.length == 0) {
            range.add(List.of(lower, upper));
            return range;
        }

        for (int i = 0; i <= nums.length; i++) {
            if (i == nums.length) {
                curr = nums[i-1];
                if (curr < upper) {
                    range.add(List.of(curr + 1, upper));
                }
                break;
            }

            curr = nums[i];

            if (i == 0 && curr > last) {
                range.add(List.of(last, curr - 1));
            } else if (curr > last + 1) {
                range.add(List.of(last + 1, curr - 1));
            }
            last = nums[i];
        }

        return range;
    }
}
