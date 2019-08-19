package org.sinlapis.offer.agt;

import java.util.Arrays;

public class Q3 {
    public static int solution(int[] arr) {
        int i = 0;
        if (arr == null) return -1;
        for (int value : arr) {
            if (value < 0 || value > arr.length - 1) return -1;
        }
        while (i < arr.length) {
            if (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) return arr[i];
                int t = arr[i];
                arr[i] = arr[arr[i]];
                arr[t] = t;
            } else {
                i++;
            }
        }
        return -1;
    }
}
