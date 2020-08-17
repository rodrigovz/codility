import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] a) {
        // write your code in Java SE 8
        Arrays.sort(a);
        int result=0;
        for (int i=0;i<a.length-2;i++) {
            for (int j=i+1;j<a.length-1;j++) {
                int k=j+1;
                while(k<a.length && a[i]+a[j]>a[k]) {
                    result++;
                    k++;
                }
            }
        }
        return result;
    }
}
