package n_169_majority_element;

//169. Majority Element (Boyer–Moore voting)
//https://leetcode.com/problems/majority-element

class Solution {
    static void main() {
        System.out.println(majorityElement(new int[]{1, 2, 1, 1, 3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{1}));
        System.out.println(majorityElement(new int[]{3,1,3,2,3,4,3}));
        System.out.println(majorityElement(new int[]{-1,-1,7}));
        System.out.println(majorityElement(new int[]{1,2,3,3,3}));
        System.out.println(majorityElement(new int[]{1,1,2,2,2}));
        System.out.println(majorityElement(new int[]{6,5,5}));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 0) return 0;

        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count+=1;
            } else if (candidate == nums[i]) {
                count+=1;
            } else {
                count-=1;
            }
        }

        return candidate;
    }
}
