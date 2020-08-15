class Solution {
    public int solution(int n) {
        // write your code in Java SE 8
        int min = Integer.MAX_VALUE;
        int i = 1;
        while (i * i <= n) {
            if (n % i == 0) {
                int current = 2 * (i + (n/i));
                min = Math.min(min, current);
            }
            i++;
        }
        return min;
    }
}
