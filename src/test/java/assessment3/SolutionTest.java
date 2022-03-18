package assessment3;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void isPowerOfTwo() {
        Solution sol = new Solution();
        assert (sol.isPowerOfTwo(1));
        assert (sol.isPowerOfTwo(2));
        assertFalse(sol.isPowerOfTwo(3));
        assert (sol.isPowerOfTwo(16));
    }
}