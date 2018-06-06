package org.blah.codility.sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    class Solution {
        public int solution(int[] A) {

            Arrays.sort(A);
            int size = A.length;

            return Math.max(
                    A[0] * A[1] * A[size - 1],
                    A[size - 1] * A[size - 2] * A[size - 3]
            );
        }
    }

}
