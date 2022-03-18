package assessment4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void findDisappearedNumbers() {
        Solution sol = new Solution();
        assertEquals(Arrays.asList(5, 6), sol.findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
        assertEquals(List.of(2), sol.findDisappearedNumbers(new int[] { 1, 1 }));
    }
}