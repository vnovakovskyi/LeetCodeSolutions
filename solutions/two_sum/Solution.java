package two_sum;

//Two Sum leetcode.com problem
//https://leetcode.com/problems/two-sum/

public class Solution {
    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15}, 9); //Output: [0,1]
        twoSum(new int[]{3, 2, 4}, 6);     //Output: [1,2]
        twoSum(new int[]{3, 3}, 6);       //Output: [0,1]
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
