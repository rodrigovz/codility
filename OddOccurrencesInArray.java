import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<a.length;i++) {
            if (set.contains(a[i])) {
                set.remove(a[i]);
            } else {
                set.add(a[i]);
            }
        }
        return set.toArray(new Integer[0])[0];
    }
}
