class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        int[] sum = new int[a.length];
        sum[a.length-1] = a[a.length-1];
        for (int i=a.length-2;i>=0;i--) {
            sum[i] = sum[i+1] + a[i];
        }
        int result = 0;
        for (int i=0;i<a.length;i++) {
            if (a[i] == 0) {
                result+=sum[i];
            }
            if (result > 1000000000) {
                return -1;
            }
        }
        return result;
    }
}
