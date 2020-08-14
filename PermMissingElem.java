class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        boolean[] vec = new boolean[a.length+1];
        for (int i=0;i<a.length;i++) {
            vec[a[i]-1] = true;
        }
        int result = -1;
        for (int i=0;i<vec.length;i++) {
            if (vec[i] == false) {
                result = i+1;
                break;
            }
        }
        return result;
    }
}
