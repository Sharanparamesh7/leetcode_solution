class Solution {
    public boolean isPalindrome(int n) {
        int rem, rev = 0;
        int m = n;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (m == rev) {
            return true;
        }
        return false;
    }
}