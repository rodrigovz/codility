class Solution {
    public int[] solution(int n, int[] a) {
        // write your code in Java SE 8
        int[] result = new int[n];
        int max = 0;
        int min = 0;
        for (int i=0;i<a.length;i++) {
            if (a[i] <= n) {
                if (result[a[i]-1] < min) {
                    result[a[i]-1] = min+1;
                } else {
                    result[a[i]-1]++;    
                }
                if (result[a[i]-1] > max) {
                    max = result[a[i]-1];
                }
            } else {
                min = max;
            }
        }
        if (min > 0) {
            for (int j=0;j<result.length;j++) {
                if (result[j] < min) {
                    result[j] = min;    
                }
            }    
        }
        return result;
    }
}
