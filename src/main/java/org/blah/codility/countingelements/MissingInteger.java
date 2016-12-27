package org.blah.codility.countingelements;

/**
 * Created by adam on 03.10.16.
 */
public class MissingInteger {

    public int solution(int[] A) {

        boolean[] first100000 = new boolean[100001];

        for (int i = 0; i < A.length; i++) {
            int element = A[i];
            if (element <= 100000 && element > 0) {
                first100000[element] = true;
            }
        }

        for (int i = 1; i < first100000.length; i++) {
            boolean notEmpty = first100000[i];
            if (!notEmpty) {
                return i;
            }
        }

        return 100001;
    }

}
