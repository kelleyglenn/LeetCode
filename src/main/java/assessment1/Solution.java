package assessment1;

class Solution {

    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            StringBuilder toReverse = new StringBuilder(s.substring(i, Math.min(s.length(), i + k)));
            result.append(toReverse.reverse());
            i += k;
            if (i < s.length()) {
                result.append(s, i, Math.min(s.length(), i + k));
            }
            i += k;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Input: s = \"abcdefg\", k = 2");
        System.out.println("Output: " + sol.reverseStr("abcdefg", 2));
        System.out.println();
        System.out.println("Input: s = \"abcd\", k = 2");
        System.out.println("Output: " + sol.reverseStr("abcd", 2));
    }

}
