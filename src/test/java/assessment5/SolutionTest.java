package assessment5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void licenseKeyFormatting() {
        Solution sol = new Solution();
        assertEquals("5F3Z-2E9W", sol.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        assertEquals("2-5G-3J", sol.licenseKeyFormatting("2-5g-3-J",  2));
        assertEquals("24-A0R-74K", sol.licenseKeyFormatting("2-4A0r7-4k", 3));
        assertEquals("2", sol.licenseKeyFormatting("2", 2));
    }
}