class Solution {
    public int solution(int x, int[] a) {
        // write your code in Java SE 8
        boolean[] visited = new boolean[x+1];
        int total = 0;
        for (int i=0;i<a.length;i++) {
            if (a[i] <= x && visited[a[i]] == false) {
                visited[a[i]] = true;
                total++;
                if (total == x) {
                    return i;
                }
            }
        }
        return -1;
    }
}
