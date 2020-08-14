class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        int value = 0;
        int size = 0;
        for (int i=0;i<a.length;i++) {
            if (size == 0) {
                size++;
                value = a[i];
            } else {
                if (a[i] == value) {
                    size++;
                } else {
                    size--;
                }
            }
        }
        if (size == 0) {
            return 0;
        }
        int count = 0;
        for(int i=0;i<a.length;i++) {
            if (a[i] == value) {
                count++;
            }
        }
        int result = 0;
        int current = 0;
        if (count > a.length/2) {
            for (int i=0;i<a.length-1;i++) {
                if (a[i] == value) {
                    current++;
                }
                if (current > (i+1) / 2 && 
                    count - current > (a.length-(i+1)) / 2) {
                    result++;
                }
            }
            return result;
        } else {
            return 0;
        }
        
    }
}
