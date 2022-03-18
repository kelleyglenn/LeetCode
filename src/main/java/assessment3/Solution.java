package assessment3;

public class Solution {

    public boolean isPowerOfTwo(int n) {
        return (n == 1) || (n != 0 && (Math.floor((float) n / 2) * 2 == n) && isPowerOfTwo(n / 2));
    }
}
