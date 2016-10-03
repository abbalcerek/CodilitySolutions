package org.blah.codility.prefixsums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adam on 04.10.16.
 */
public class GenomicRangeQueryUgly {

    Map<Character, Integer> impacts = new HashMap<>();


    public int[] solution(String S, int[] P, int[] Q) {
        initImpacts();

        int[] bounds = new int[S.length()];
        int[] values = new int[S.length()];

        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int first = P[i];
            int second = Q[i];

        }

        return null;
    }

    private void initImpacts() {
        impacts.put('A', 1);
        impacts.put('C', 2);
        impacts.put('G', 3);
        impacts.put('T', 4);
    }

}
