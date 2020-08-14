class Solution {
    public int solution(int x, int y, int d) {
        // write your code in Java SE 8
        int result = (y-x)/d;
        if ((y-x)%d > 0) {
            result++;
        }
        return result;
    }
}
