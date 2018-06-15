package org.blah.codility.primeandcompositenumbers;

public class CountFactors {

    public int solution(int N) {
        int i = 1;
        int counter = 0;
        while (i < Math.sqrt(N)) {
            if (N % i == 0) {
                counter++;
            }
            i++;
        }

        int addOne = (int) Math.sqrt(N) == Math.sqrt(N) ? 1 : 0;
        return counter * 2 + addOne;
    }

}
