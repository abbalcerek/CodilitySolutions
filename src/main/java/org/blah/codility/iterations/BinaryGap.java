package org.blah.codility.iterations;

/**
 * Created by adam on 30.09.16.
 */
public class BinaryGap {

    public int solution(int N) {

        int longestSeq = 0;
        int currentN = N;
        int lenAcc = 0;

        currentN = dropTrailingZeros(currentN);
        while (currentN > 0) {
            if (currentN % 2 == 0) {
                lenAcc += 1;
            } else {
                currentN -= 1;
                longestSeq = max(lenAcc, longestSeq);
                lenAcc = 0;
            }
            currentN /= 2;
        }

        return longestSeq;
    }

    private int dropTrailingZeros(int N) {
        int currentN = N;
        while (currentN % 2 == 0) {
            currentN /= 2;
        }
        return currentN;
    }

    private int max(int n, int m) {
        int result = n;
        if (m > n) {
            result = m;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new BinaryGap().solution(51712));
    }
}
