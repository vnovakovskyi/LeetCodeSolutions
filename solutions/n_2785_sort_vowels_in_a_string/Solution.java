package n_2785_sort_vowels_in_a_string;

//2785. Sort Vowels in a String
//https://leetcode.com/problems/sort-vowels-in-a-string/description/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sortVowels("asadgf"));
        System.out.println(sortVowels("fjftyref"));
        System.out.println(sortVowels("qwertyui"));
    }

    public static String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }
        Collections.sort(vowels);

        StringBuilder result = new StringBuilder();
        int index = 0;

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                result.append(vowels.get(index++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
