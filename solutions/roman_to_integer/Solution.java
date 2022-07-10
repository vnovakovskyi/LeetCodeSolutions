package roman_to_integer;

//Roman to Integer leetcode.com problem
//https://leetcode.com/problems/roman-to-integer/

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static Map<Character, Integer> romToIntMap;
    static {
        romToIntMap = new HashMap<>();
        romToIntMap.put('I',1);
        romToIntMap.put('V',5);
        romToIntMap.put('X',10);
        romToIntMap.put('L',50);
        romToIntMap.put('C',100);
        romToIntMap.put('D',500);
        romToIntMap.put('M',1000);
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III")); //3
        System.out.println(romanToInt("LVIII")); //58
        System.out.println(romanToInt("MCMXCIV")); //1994
    }

    public static int romanToInt(String s) {
        char[] romanArr = s.toCharArray();
        int res = 0;

        for (int i = romanArr.length-1; i >= 0; i--) {
            int num = romToIntMap.get(romanArr[i]);

            if (i > 0 && num > romToIntMap.get(romanArr[i-1])) {
                res += num - romToIntMap.get(romanArr[i-1]);
                i--;
            } else {
                res += num;
            }
        }

        return res;
    }

    //I   1
    //V   5
    //X   10
    //L   50
    //C   100
    //D   500
    //M   1000
}
