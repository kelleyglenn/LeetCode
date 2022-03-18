package assessment5;

public class Solution {

    public String licenseKeyFormatting(String s, int k) {
        // Remove - and convert to upper
        StringBuilder result = new StringBuilder(s.toUpperCase());
        for (int i = result.indexOf("-"); i != -1; i = result.indexOf("-", i)) {
            result.replace(i, i + 1, "");
        }
        int pos = result.length() % k;
        // Calculate if special first group is needed
        if (pos != 0 && pos < result.length()) {
            result.insert(pos, '-');
            pos++;
        }
        pos += k;
        while (pos < result.length()) {
            result.insert(pos, '-');
            pos += k + 1;
        }
        return result.toString();
    }
}
