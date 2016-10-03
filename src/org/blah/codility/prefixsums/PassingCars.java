package org.blah.codility.prefixsums;

/**
 * Created by adam on 03.10.16.
 */
public class PassingCars {

    public int solution(int[] A) {

        int maxValue = 1000000000;

        int zerosSoFar = 0;
        long result = 0;

        for (int i = 0; i < A.length; i++) {
            int element = A[i];
            if (element == 0) {
                zerosSoFar += 1;
            } else {
                result += zerosSoFar;
            }
        }

        return maxValue < result ? -1 : (int)result;
    }

}
