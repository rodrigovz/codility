class Solution {
    public int solution(int n) {
        // write your code in Java SE 8
        String s = Integer.toBinaryString(n);
        int max = 0;
        int current = 0;
        char[] array = s.toCharArray();
        for (int i=1;i<array.length;i++){
            if (array[i] == '0') {
                if (current > 0) {
                    current++;
                } else if (array[i-1] == '1') {
                    current = 1;
                }
            } else {
                if (current > 0) {
                    if (current > max) {
                        max = current;
                    }        
                    current = 0;
                }
            }
        }
        return max;
    }
}
