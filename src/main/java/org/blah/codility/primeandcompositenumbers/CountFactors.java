package org.blah.codility.primeandcompositenumbers;

public class CountFactors {

    public int solution(int N) {

        int count = 0;
        for (int i = 1; i < Math.sqrt(N) + 1; i++) {

            if (N % i == 0) {
                count += 1;
            }
        }

        if (Math.pow(Math.sqrt(N), 2) == N)
            return 2 * count - 1;
        else
            return 2 * count;
    }

    public static void main(String... args) {
        System.out.println(Math.sqrt(4) == 2);
    }

}
