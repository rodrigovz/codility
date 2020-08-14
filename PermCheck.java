class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        boolean[] visited = new boolean[a.length];
        for (int i=0;i<a.length;i++) {
            if (a[i] > a.length) {
                return 0;
            } else if (visited[a[i]-1] == true) {
                return 0;
            } else {
                visited[a[i]-1] = true;
            }
        }
        return 1;
    }
}
