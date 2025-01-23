package n_3280_сonvert_date_to_binary;

//3280. Convert Date to Binary
//https://leetcode.com/problems/convert-date-to-binary/description/

/*

Example 1:

Input: date = "2080-02-29"

Output: "100000100000-10-11101"

Explanation:

100000100000, 10, and 11101 are the binary representations of 2080, 02, and 29 respectively.

Example 2:

Input: date = "1900-01-01"

Output: "11101101100-1-1"

Explanation:

11101101100, 1, and 1 are the binary representations of 1900, 1, and 1 respectively.



 */


public class Solution {
    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2080-02-29"));
        System.out.println(convertDateToBinary("1900-01-01"));

        System.out.println(convertDateToBinaryFastest("2080-02-29"));
        System.out.println(convertDateToBinaryFastest("1900-01-01"));
    }

    /*

    Runtime 8ms
    Beats 36.99%

    Memory 42.69MB
    Beats 65.16%

     */

    public static String convertDateToBinary(String date) {
        String[] parts = date.split("-");

        return Integer.toBinaryString(Integer.parseInt(parts[0])) +
                "-" + Integer.toBinaryString(Integer.parseInt(parts[1])) +
                "-" + Integer.toBinaryString(Integer.parseInt(parts[2]));
    }

    /*

    Runtime 1ms
    Beats 100%

    Memory 42.59MB
    Beats 77.21%

     */

    public static String convertDateToBinaryFastest(String date) {
        int year = Integer.parseInt(date, 0, 4, 10);
        int month = Integer.parseInt(date, 5, 7, 10);
        int day = Integer.parseInt(date, 8, 10, 10);

        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(year));
        sb.append("-");
        sb.append(Integer.toBinaryString(month));
        sb.append("-");
        sb.append(Integer.toBinaryString(day));

        return sb.toString();
    }
}
