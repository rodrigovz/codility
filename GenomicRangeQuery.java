// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String s, int[] p, int[] q) {
        // write your code in Java SE 8
        int[] result = new int[p.length];
        for (int i=0;i<p.length;i++) {
            String sub = s.substring(p[i],q[i]+1);
            char[] letters = sub.toCharArray();
            result[i] = getValue(getMin(letters));
        }
        return result;
    }
    
    private char getMin(char[] letters) {
        char min = 'T';
        for (int i=0;i<letters.length;i++) {
            if (letters[i] < min) {
                min = letters[i];
            }
        }
        return min;
    }
    
    private int getValue(char c) {
        if (c == 'A') {
            return 1;
        } else if (c == 'C') {
            return 2;
        } else if (c == 'G') {
            return 3;
        } else {
            return 4;
        }
    }
}
