package org.blah.codility.notcodility.findminimalint;

import org.blah.codility.Test;

import java.lang.reflect.InvocationTargetException;

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

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Test.testArrayToInt(new int[]{1, 2}, 3, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{1, 3}, 2, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{-11, 2, 4}, 1, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{-1, -2, 0}, 1, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{}, 1, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{1, 2, 3}, 4, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{3, 2, 1}, 4, FindMinimalInt.class);
        Test.testStatus();
    }


}
