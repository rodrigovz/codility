class Solution {
    public int solution(int a, int b, int k) {
        // write your code in Java SE 8
        int result = 0;
        for (int i=a;i<=b;i++) {
            if (i % k == 0) {
                result = ((b-i)/k) + 1;
                break;
            }
        }
        return result;
    }
}
