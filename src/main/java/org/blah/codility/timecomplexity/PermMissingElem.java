package org.blah.codility.timecomplexity;

/**
 * Created by adam on 02.10.16.
 */
public class PermMissingElem {

    public int solution(int[] A) {
        long max = A.length + 1;
        long sum = sum(A);
        return (int) (((1 + max) * max) / 2 - sum);
    }

    private long sum(int[] A) {
        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }

}
