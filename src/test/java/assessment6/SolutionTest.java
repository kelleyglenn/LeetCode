package assessment6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void lengthLongestPath() {
        Solution sol = new Solution();
        assertEquals(20, sol.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
    }
}