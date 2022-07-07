class Solution {
    public boolean isPalindrome(int x) {
        int a = x;
        int b = 0;
        while (a >= 0) {
            int remainder = a % 10;
            a = a / 10;
            b = b * 10 + remainder;
        }
        return x == b;
    }
}