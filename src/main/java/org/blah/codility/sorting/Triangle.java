package org.blah.codility.sorting;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] A) {

        if (A.length < 3) return 0;

        Arrays.sort(A);
        int i = 2;

        while (i < A.length) {
            if (A[i] - A[i - 1] - A[i - 2] < 0) return 1;
            i++;
        }

        return 0;
    }

}
