import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        Arrays.sort(a);
        int val1 = a[a.length-1] * a[a.length-2] * a[a.length-3];
        int val2 = a[0] * a[1] * a[a.length-1];
        return val1 > val2 ? val1 : val2;
    }
}
