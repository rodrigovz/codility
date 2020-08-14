import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String s) {
        // write your code in Java SE 8
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return 0;
                }
                stack.pop();
            }
        }
        if (!stack.empty()) {
            return 0;
        }
        return 1;
    }
}
