package org.blah.codility.timecomplexity;

/**
 * Created by adam on 30.09.16.
 */
public class TapeEquilibrium {

    public int solution(int[] A) {

        int sum = sum(A);
        int min = 100000000;
        int partialSum = 0;

        for (int i = 0; i < A.length - 1; i++) {
            partialSum += A[i];
            min = min(min, abs(2 * partialSum - sum));
        }

        return min;
    }

    private int abs(int n) {
        int result = n;
        if (n < 0) {
            result = -n;
        }
        return result;
    }

    private int min(int n, int m) {
        int result = n;
        if (m < n) {
            result = m;
        }
        return result;
    }

    private int sum(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arg = new int[]{9, 3, 9, 3, 9, 7, 9};
        System.out.println(new TapeEquilibrium().solution(arg));
    }

}
