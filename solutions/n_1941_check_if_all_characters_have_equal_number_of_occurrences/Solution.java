package n_1941_check_if_all_characters_have_equal_number_of_occurrences;

//1941. Check if All Characters Have Equal Number of Occurrences
//https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abc"));
        System.out.println(areOccurrencesEqual("dddaaa"));
        System.out.println(areOccurrencesEqual("dddaaat"));
    }

    public static boolean areOccurrencesEqual(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            max = Math.max(max, map.get(s.charAt(i)));
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) < max) {
                return false;
            }
        }

        return true;
    }
}
