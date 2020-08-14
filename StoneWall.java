import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] h) {
        // write your code in Java SE 8
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<>();
        int sumStack = 0;
        int result = 0;
        for (int i=0;i<h.length;i++) {
            if (stack.empty()) {
                stack.push(h[i]);
                sumStack = h[i];
                result++;
                continue;
            }
            if (h[i] == sumStack) {
                continue;
            } else if (h[i] < sumStack) {
                while(!stack.empty() && sumStack > h[i]) {
                    Integer last = stack.pop();
                    sumStack -= last;
                }
                if (sumStack == h[i]) {
                    continue;
                } else {
                    stack.push(h[i]-sumStack);
                    sumStack = h[i];
                    result++;
                }
            } else {
                stack.push(h[i]-sumStack);
                sumStack = h[i];
                result++;
            }
        }
        return result;
    }
}
