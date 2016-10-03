package org.blah.codility.countingelements;

/**
 * Created by adam on 03.10.16.
 */
public class PermCheck {

    public int solution(int[] A) {

        boolean[] seen = new boolean[A.length];

        int permutationSum = ((1 + A.length) * A.length) / 2;
        int sum = 0;
        int result = 1;

        for (int i = 0; i < A.length; i++) {
            int element = A[i];
            if (seen[element - 1] || seen[element - 1]) {
                result = 0;
                break;
            }
            seen[element - 1] = true;
            sum += element;
        }

        if (sum != permutationSum) {
            result = 0;
        }

        return result;
    }

}
