class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int i=0;i<a.length;i++) {
            current = Math.max(a[i], current + a[i]);
            max = Math.max(max, current);
        }
        return max;
    }
}
