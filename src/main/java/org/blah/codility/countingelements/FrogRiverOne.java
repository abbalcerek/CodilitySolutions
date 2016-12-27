package org.blah.codility.countingelements;

/**
 * Created by adam on 03.10.16.
 */
public class FrogRiverOne {

    public int solution(int X, int[] A) {

        boolean[] missing = new boolean[X];
        int missingCount = X;

        for (int i = 0; i < A.length; i++) {
            if (!missing[i]) {
                missingCount -= 1;
                missing[A[i]] = true;
            }
            if (missingCount == 0) {
                return i;
            }
        }

        return -1;
    }

}
