package n_15_3Sum;

//15. 3Sum
//https://leetcode.com/problems/3sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int x = nums[i] + nums[j] + nums[k];
                if (x >= 0) {
                    if (x == 0) {
                        res.add(List.of(nums[i], nums[j], nums[k]));
                    }
                    int d = k-1;
                    while (nums[k] == nums[d]  && d > 0) {
                        d--;
                    }
                    k = d;
                } else {
                    int d = j+1;
                    while (nums[j] == nums[d] && d < nums.length -1) {
                        d++;
                    }
                    j = d;
                }
            }
        }

        return res;
    }
 }
