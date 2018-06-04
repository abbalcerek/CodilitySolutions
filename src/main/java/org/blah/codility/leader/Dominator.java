package org.blah.codility.leader;

/**
 * Created by adam on 02.06.18.
 */
public class Dominator {

    public int solution(int[] A) {

        int len = A.length;
        if (len == 0) return -1;

        int depth = 1;
        int value = A[0];

        for (int i = 1; i < len; i++) {
            int elem = A[i];
            if (depth == 0) {
                depth += 1;
                value = elem;
            } else if (elem == value) {
                depth += 1;
            } else {
                depth -= 1;
            }

        }

        if (depth == 0) return -1;
        else return countElementAndFindIndex(value, A);
    }

    private int countElementAndFindIndex(int element, int[] arr) {
        int count = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                count++;
                index = i;
            }
        }
        if (count * 2 > arr.length)
            return index;
        else return -1;
    }

}
