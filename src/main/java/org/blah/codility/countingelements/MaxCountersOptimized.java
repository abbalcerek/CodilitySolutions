package org.blah.codility.countingelements;

import java.util.Arrays;

/**
 * Created by adam on 03.10.16.
 */
public class MaxCountersOptimized {

    public int[] solution(int N, int[] A) {
        int max = 0;
        int lastMaxThreshold = 0;
        int[] result = new int[N];
        for (int i = 0; i < A.length; i++) {
            int element = A[i] - 1;
            if (element  == N) {
                lastMaxThreshold = max;
            } else {
                if (result[element] < lastMaxThreshold) {
                    result[element] = lastMaxThreshold;
                }
                result[element] += 1;
                max = max(max, result[element]);
            }
        }
        toMaxThreshold(result, lastMaxThreshold);
        return result;
    }

    private void toMaxThreshold(int[] counters, int maxThreshold) {
        for (int i = 0; i < counters.length; i++) {
            counters[i] = max(maxThreshold, counters[i]);
        }
    }

    private int max(int n, int m) {
        int result = n;
        if (m > n) {
            result = m;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] seq = new int[]{3, 4, 4, 6, 1, 4, 4};
        System.out.println(Arrays.toString(new MaxCounters().solution(5, seq)));
    }

}
