package algorithm121221;

import java.util.Arrays;

public class Programmers12954 {
    public static void main(String[] args) {
        long[] answer = {};
        int x = -4;
        int n = 2;
        answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }

        System.out.println(Arrays.toString(answer));

    }
}
