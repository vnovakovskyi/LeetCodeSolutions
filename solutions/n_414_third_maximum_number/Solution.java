package n_414_third_maximum_number;

//414. Third Maximum Number
//https://leetcode.com/problems/third-maximum-number/description/

public class Solution {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{4, 9, 5}));
        System.out.println(thirdMax(new int[]{3, 2, 1}));
        System.out.println(thirdMax(new int[]{1, 2}));
        System.out.println(thirdMax(new int[]{2, 2, 3, 1}));
    }

    public static int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        boolean foundMax3 = false;

        for (int num : nums) {
            if (num == max1 || num == max2 || num == max3) continue;

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
                foundMax3 = max3 != Long.MIN_VALUE;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
                foundMax3 = max3 != Long.MIN_VALUE;
            } else if (num > max3) {
                max3 = num;
                foundMax3 = true;
            }
        }

        if (foundMax3) {
            return (int) max3;
        }
        return (int) max1;
    }
}
