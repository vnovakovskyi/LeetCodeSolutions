package valid_parentheses;

//Valid Parentheses leetcode.com problem
//https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class Solution {
    public static Stack<Integer> sequence = new Stack<>();

    public static void main(String[] args) {
        boolean result = isValid("()");
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();

        for (char ch : arr) {
            Integer type = defineBracket(ch);
            if (!fillStack(type, ch)){
                return false;
            }
        }

        return sequence.empty();
    }

    public static Integer defineBracket(char bracket) {
    /*
        ( - 1
        [ - 2
        { - 3
     */

        if (bracket == '(' || bracket == ')') {
            return 1;
        } else if (bracket == '[' || bracket == ']') {
            return 2;
        } else {
            return 3;
        }
    }


    public static boolean isBracketOpened(char bracket) {
        return (bracket == '(' || bracket == '{' || bracket == '[');
    }

    public static boolean fillStack(Integer type, char bracket) {
        if (sequence.empty()) {
            if (isBracketOpened(bracket)) {
                sequence.push(type);
            } else {
                return false;
            }
        } else {
            if (sequence.peek().equals(type) && !isBracketOpened(bracket)) {
                sequence.pop();
            } else if (!sequence.peek().equals(type) && !isBracketOpened(bracket)) {
                return false;
            } else if (isBracketOpened(bracket)) {
                sequence.push(type);
            }
        }
        return true;
    }
}
