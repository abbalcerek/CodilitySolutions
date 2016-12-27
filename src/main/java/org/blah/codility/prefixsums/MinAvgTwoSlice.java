package org.blah.codility.prefixsums;

/**
 * Created by Adam Balcerek on 12/27/16.
 */
public class MinAvgTwoSlice {

    public int solution(int[] A) {
        double min = sortMean(A, 0);
        int minIndex = 0;
        for (int i = 1; i < A.length - 1; i ++) {
            double currentMean = sortMean(A, i);
            if (currentMean < min) {
                min = currentMean;
                minIndex = i;
            }
        }
        return minIndex;
    }

    private double sortMean(int[] A, int position) {
        double twoSlice = A[position] + A[position + 1];
        double threeSlice = A.length -2 == position ? twoSlice * 3. / 2. : twoSlice + A[position + 2];
        return Math.min(twoSlice / 2., threeSlice / 3.);
    }

    public static void main(String[] args) {
        int[] arg = new int[]{4, 2, 2, 5, 1, 5, 8};
        System.out.println(new MinAvgTwoSlice().solution(arg));
    }

}
