package n_219_contains_duplicate_II;

//219. Contains Duplicate II
//https://leetcode.com/problems/contains-duplicate-ii

import java.util.*;

class Solution {
    static void main() {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> rev = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (rev.containsKey(n) && i - rev.get(n) <= k) {
                return true;
            }
            rev.put(n, i);
        }

        return false;
    }
}
