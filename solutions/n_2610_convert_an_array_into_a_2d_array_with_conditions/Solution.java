package n_2610_convert_an_array_into_a_2d_array_with_conditions;

//2610. Convert an Array Into a 2D Array With Conditions
//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findMatrix(new int[]{4, 9, 5}));
        System.out.println(findMatrix(new int[]{1, 2, 1}));
        System.out.println(findMatrix(new int[]{1, 2, 1, 2, 1, 2, 3, 4, 5, 5, 5}));
        System.out.println(findMatrix(new int[]{2, 2, 3, 1}));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
                res.get(0).add(nums[i]);
            } else {
                int index = map.get(nums[i]);

                if (res.size() == index+1) {
                    res.add(new ArrayList<>());
                }

                res.get(index+1).add(nums[i]);
                map.put(nums[i], index + 1);
            }
        }

        return res;
    }
}
