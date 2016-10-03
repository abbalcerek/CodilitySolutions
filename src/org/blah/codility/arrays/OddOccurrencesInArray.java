package org.blah.codility.arrays;

/**
 * Created by adam on 30.09.16.
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {
        int result = A[0];
        for (int i = 1; i < A.length; i++) {
            result = A[i] ^ result;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arg = new int[]{9, 3, 9, 3, 9, 7, 9};
        System.out.println(new OddOccurrencesInArray().solution(arg));
    }

}
