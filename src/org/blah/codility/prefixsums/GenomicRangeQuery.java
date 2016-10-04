package org.blah.codility.prefixsums;


/**
 * Created by adam on 03.10.16.
 */
public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        int[] oncCounts = initCounts(S, 'A');
        int[] twoCounts = initCounts(S, 'C');
        int[] treeCounts = initCounts(S, 'G');

        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int first = P[i];
            int second = Q[i];
            if (contains(first, second, oncCounts)) {
                result[i] = 1;
            } else if (contains(first, second, twoCounts)) {
                result[i] = 2;
            } else if (contains(first, second, treeCounts)) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        return result;
    }

    private boolean contains(int first, int second, int[] counts) {
        boolean result = false;
        if (first == 0) {
            result = counts[second] > 0;
        } else {
            result = counts[second] > counts[first - 1];
        }
        return result;
    }

    private int[] initCounts(String S, char character) {
        int[] result = new int[S.length()];
        int previous = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == character) {
                previous += 1;
            }
            result[i] = previous;
        }
        return result;
    }

}
