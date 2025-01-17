package n_349_intersection_of_two_arrays;

//349. Intersection of Two Arrays
//https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println((Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}))));
        System.out.println((Arrays.toString(intersectionBitMap(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        boolean[] present = new boolean[1001];
        for (int num : nums1) {
            present[num] = true;
        }

        boolean[] intersection = new boolean[1001];
        int count = 0;

        for (int num : nums2) {
            if (present[num] && !intersection[num]) {
                intersection[num] = true;
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < 1001; i++) {
            if (intersection[i]) {
                result[index++] = i;
            }
        }

        return result;
    }

    public static int[] intersectionBitMap(int[] nums1, int[] nums2) {
        // Using array of integers as bit map (32 bits × 32 integers = 1024 bits)
        int[] bitmap = new int[32];  // enough to cover 0-1000
        int count = 0;

        // Setting bits for nums1
        for (int num : nums1) {
            int wordIndex = num / 32;
            int bitIndex = num % 32;
            bitmap[wordIndex] |= (1 << bitIndex);
        }

        // Creating temporary array for results
        int[] temp = new int[Math.min(nums1.length, nums2.length)];

        // Checking nums2 against bitmap
        for (int num : nums2) {
            int wordIndex = num / 32;
            int bitIndex = num % 32;
            if ((bitmap[wordIndex] & (1 << bitIndex)) != 0) {
                // Found in nums1, clear the bit and add to result
                bitmap[wordIndex] &= ~(1 << bitIndex);
                temp[count++] = num;
            }
        }

        return Arrays.copyOf(temp, count);
    }
}
