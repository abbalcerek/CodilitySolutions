package org.blah.codility.prefixsums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adam on 03.10.16.
 */
public class GenomicRangeQuery {

    Map<Character, Integer> impacts = new HashMap<>();

    public int[] solution(String S, int[] P, int[] Q) {
        initImpacts();
        int[] leftMin = initLeftMin(S);
        int[] rightMin = initRightMin(S);

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

    private int[] initLeftMin(String s) {
        int[] result = new int[s.length()];
        int min = 4;
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            min = min(min, impacts.get(character));
            result[i] = min;
        }
        return result;
    }

    private int[] initRightMin(String s) {
        int[] result = new int[s.length()];
        int min = 4;
        for (int i = s.length() - 1; i >= 0; i--) {
            char character = s.charAt(i);
            min = min(min, impacts.get(character));
            result[i] = min;
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

}
