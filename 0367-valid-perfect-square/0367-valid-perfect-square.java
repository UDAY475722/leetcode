class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        return perfectSquare(num, 2, num / 2);
    }

    private boolean perfectSquare(int num, int left, int right) {
        if (left > right) return false;
        int mid = left + (right - left) / 2;
        long decision = (long) mid * mid;

        if (decision == num) return true;
        else if (decision > num) return perfectSquare(num, left, mid - 1);
        else return perfectSquare(num, mid + 1, right);
    }
}
