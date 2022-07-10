package longest_common_prefix;

//Longest Common Prefix leetcode.com problem
//https://leetcode.com/problems/longest-common-prefix/


import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        String res = longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String prefix = strs[0];

        for (int i = 1; i < strs.length; ++i) {
            while (prefix.length() != 0 && !strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
