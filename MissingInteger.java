class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        boolean visited[] = new boolean[100001];
        for (int i=0;i<a.length;i++) {
            if (a[i] > 0 && a[i] <= 100001) {
                visited[a[i]-1] = true;
            }
        }
        int result = 0;
        for (int i=0;i<visited.length;i++) {
            if (visited[i] == false) {
                result = i+1;
                break;
            }
        }
        return result;
    }
}
