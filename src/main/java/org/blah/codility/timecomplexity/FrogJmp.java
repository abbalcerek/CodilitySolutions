package org.blah.codility.timecomplexity;

/**
 * Created by adam on 02.10.16.
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int dist = Y - X;
        int result = dist / D;
        if (dist % D != 0) {
            result += 1;
        }
        return result;
    }

}
