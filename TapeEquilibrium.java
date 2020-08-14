class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        int[] sum = new int[a.length];
        int total=0;
        for (int i=0;i<a.length;i++) {
            total+=a[i];
            sum[i] = total;
        }
        int min = Integer.MAX_VALUE;
        for (int i=0;i<a.length-1;i++) {
            int current = Math.abs(sum[i]-(total-sum[i]));
            if (current < min) {
                min = current;
            }
        }
        return min;
    }
}
