package palindrome_number;

//Palindrome Number leetcode.com problem
//https://leetcode.com/problems/palindrome-number/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-2));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(9));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(100));
        System.out.println(isPalindrome(111));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(12344321));
        System.out.println(isPalindrome(9087809));
    }

    public static boolean isPalindrome(int x) {

        if (x < 10) {
            return x >= 0;
        }

        int[] array = new int[1];
        array[0] = x % 10;
        x /= 10;

        while (x > 0) {
            array = Arrays.copyOf(array, array.length+1);
            array[array.length-1] = x % 10;
            x /= 10;
        }

        for (int i = 0; i < array.length; ++i) {
            if (array[i] != array[array.length-1 -i]) {
                return false;
            }

            if ((array.length-1 -i) - i == 1 || (array.length-1 -i) == i) {
                return true;
            }
        }

        return false;
    }
}
