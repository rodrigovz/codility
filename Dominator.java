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
            return -1;
        }
        int count = 0;
        int index = 0;
        for (int i=0;i<a.length;i++) {
            if (a[i] == value) {
                count++;
                index = i;
            }
        }
        if (count > a.length / 2) {
            return index;
        }
        return -1;
    }
}
