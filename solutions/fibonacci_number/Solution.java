package fibonacci_number;

//Fibonacci Number leetcode.com problem
//https://leetcode.com/problems/fibonacci-number/

public class Solution {
    public static void main(String[] args) {
        System.out.println(fib1(6));

    }

    public static int fib(int n) {
        if (n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib1(int n) {
        if (n == 0 || n == 1) return n;

        int[] fib = new int[n + 1];
        fib[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    // 0 1 1 2 3 5 8 13
}
