package n_157_read_n_characters_given_read4;

/**
 * Local stand-in for LeetCode's Reader4, so Solution compiles and can be run locally.
 * Set the "file" with setFile(...), then call read(...).
 */
public class Reader4 {
    private char[] file = new char[0];
    private int pos = 0;

    public void setFile(String content) {
        this.file = content.toCharArray();
        this.pos = 0;
    }

    /** Reads up to 4 chars from the file into buf4; returns how many were read (0 = end of file). */
    public int read4(char[] buf4) {
        int read = 0;
        while (read < 4 && pos < file.length) {
            buf4[read++] = file[pos++];
        }
        return read;
    }
}
