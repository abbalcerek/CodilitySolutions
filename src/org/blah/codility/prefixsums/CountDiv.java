package org.blah.codility.prefixsums;

/**
 * Created by adam on 03.10.16.
 */
public class CountDiv {

    public int solution(int A, int B, int K) {
        int before = A % K == 0 ? A / K - 1 : A / K;
        return B / K - before;
    }

}
