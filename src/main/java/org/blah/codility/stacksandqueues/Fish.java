package org.blah.codility.stacksandqueues;

public class Fish {

    public int solution(int[] A, int[] B) {

        int[] stack = new int[A.length];
        int stackIndex = -1;
        int eaten = 0;

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                stackIndex += 1;
                stack[stackIndex] = i;
            } else {
                while (stackIndex != -1) {
                    eaten += 1;
                    if (A[stack[stackIndex]] > A[i]) {
                        break;
                    } else {
                        stackIndex -= 1;
                    }
                }
            }
        }

        return A.length - eaten;
    }

}
