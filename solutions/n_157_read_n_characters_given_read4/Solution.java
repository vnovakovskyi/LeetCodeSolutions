package n_157_read_n_characters_given_read4;

//157. Read N Characters Given Read4
//https://leetcode.com/problems/read-n-characters-given-read4

/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        char[] buf4 = new char[4];
        int count = 0;

        do {
            int ch4 = read4(buf4);

            if (ch4 == 0) return count;

            if (count + ch4 <= n) {
                copyArray(buf, buf4, ch4, count);
                count += ch4;
            } else {
                copyArray(buf, buf4, n - count, count);
                count += n - count;
            }

        } while (count < n);

        return count;
    }

    private void copyArray(char[] dest, char[] src, int amount, int count) {
        for (int i = 0; i < amount; i++) {
            dest[count + i] = src[i];
        }
    }
}
