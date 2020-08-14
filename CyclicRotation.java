class Solution {
    public int[] solution(int[] a, int k) {
        // write your code in Java SE 8
        int[] result = new int[a.length];
        for (int i=0;i<a.length;i++) {
            int index = (i + k) % a.length;
            result[index] = a[i];
        }
        return result;
    }
}
