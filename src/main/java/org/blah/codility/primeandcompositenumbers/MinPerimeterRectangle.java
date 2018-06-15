package org.blah.codility.primeandcompositenumbers;


import static java.lang.Math.sqrt;

public class MinPerimeterRectangle {

    public int solution(int N) {

        int i;
        for (i = (int) sqrt(N); i > 0; i--) {
            if (N % i == 0) {
                break;
            }

        }
        return 2 * (i + N / i);
    }

    public static void main(String ... args) {
        System.out.println(new MinPerimeterRectangle().solution(30));
    }
}
