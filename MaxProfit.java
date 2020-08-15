class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        int max = 0;
        int min = Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++) {
            if (i == 0) {
                min = a[i];
            } else if (a[i] > min) {
                max = Math.max(a[i] - min, max);
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        return max;
    }
}
