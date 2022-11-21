package plus_one;

//66. Plus One leetcode.com problem
//https://leetcode.com/problems/plus-one/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {1,2,3})));
        System.out.println(Arrays.toString(plusOne(new int[] {4,3,2,1})));
        System.out.println(Arrays.toString(plusOne(new int[] {8,9,9,9})));
        System.out.println(Arrays.toString(plusOne(new int[] {9})));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; --i) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }

        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
