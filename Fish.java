import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] a, int[] b) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for (int i=0;i<b.length;i++) {
            if (b[i] == 1) {
                stack.push(a[i]);
            } else {
                if (stack.empty()) {
                    total++;
                } else {
                    if (a[i] > stack.peek()) {
                        stack.pop();
                        i--;
                    }
                }
            }
        }
        return total + stack.size();
    }
}
