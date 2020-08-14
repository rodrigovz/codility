import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        Arrays.sort(a);
        for (int i=0;i<a.length-2;i++) {
            if ((long) a[i] + a[i+1] > a[i+2]) {
                return 1;
            }
        }
        return 0;
    }
}
