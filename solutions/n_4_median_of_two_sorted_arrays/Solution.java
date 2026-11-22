package n_4_median_of_two_sorted_arrays;

//4. Median of Two Sorted Arrays
//https://leetcode.com/problems/median-of-two-sorted-arrays

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2,3,4}, new int[]{1,2,3,4}));
        System.out.println(findMedianSortedArrays(new int[]{1,2,3,4}, new int[]{1,2,3}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merge, 0, nums1.length);
        System.arraycopy(nums2, 0, merge, nums1.length, nums2.length);

        Arrays.sort(merge);
        double median;
        int size = merge.length;

        if (size % 2 == 0 ) {
            median = (double) (merge[(size-1)/2] + merge[(size-1)/2 + 1]) / 2;
        } else {
            median = merge[size/2];
        }

        return median;
    }
}
