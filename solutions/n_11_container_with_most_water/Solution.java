package n_11_container_with_most_water;

//11. Container With Most Water
//https://leetcode.com/problems/container-with-most-water

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{1, 1}));
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int res = (j - i) * Math.min(height[i], height[j]);
            if (res > max) {
                max = res;
            }

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
}
