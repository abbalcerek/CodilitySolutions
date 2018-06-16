package org.blah.codility.notcodility.findminimalint;

public class FindMinimalInt {

    public int solution(int[] A) {

        int positiveElement = -1;
        for (int elem : A) {
            if (elem > 0) {
                positiveElement = elem;
                break;
            }
        }

        if (positiveElement < 0)
            return 1;

        for (int i = 0; i < A.length; i++) {
            int elem = A[i];
            if (elem <= 0 || elem > A.length) {
                A[i] = positiveElement;
            }

        }

        for (int i = 0; i < A.length; i++) {
            int abs = Math.abs(A[i]);
            A[abs - 1] = -Math.abs(A[abs - 1]);
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) return i + 1;
        }

        return A.length + 1;
    }

}
