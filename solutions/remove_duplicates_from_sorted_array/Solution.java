package remove_duplicates_from_sorted_array;

//Remove Duplicates from Sorted Array leetcode.com problem
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class Solution {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        int nextUniqIndex = 1;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i-1]) {
                if (nextUniqIndex != i) {
                    nums[nextUniqIndex] = nums[i];
                }
                ++nextUniqIndex;
            }
        }
        return nextUniqIndex;
    }
}
