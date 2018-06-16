package org.blah.codility.sorting;

import java.util.Arrays;

public class Distinct {

    public int solution(int[] A) {

        if (A.length == 0) return 0;
        Arrays.sort(A);

        int count = 1;
        int previous = A[0];
        for (int elem: A) {
            if (previous != elem) {
                count++;
            }
            previous = elem;
        }

        return count;
    }

}
