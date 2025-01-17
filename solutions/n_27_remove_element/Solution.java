package n_27_remove_element;

//27. Remove Element
//https://leetcode.com/problems/remove-element/description/

public class Solution {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (k < i) {
                    nums[k] = nums[i];
                }
                k++;
            }
        }

        return k;
    }
}
