package n_268_missing_number;

//268. Missing Number
//https://leetcode.com/problems/missing-number/description/

public class Solution {
    public static void main(String[] args) {
        missingNumber(new int[]{3, 0, 1});
        missingNumber(new int[]{0, 1});
        missingNumber(new int[]{8, 6, 4, 2, 3, 5, 7, 0, 1});
    }

    public static int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
