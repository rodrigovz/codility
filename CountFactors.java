class Solution {
    public int solution(int n) {
        // write your code in Java SE 8
        int i = 1;
        int result = 0;
        while(i * i < n) {
            if (n % i == 0) {
                result+=2;
            }
            i++;
        }
        if (i * i == n) {
            result++;
        }
        return result;
    }
}
