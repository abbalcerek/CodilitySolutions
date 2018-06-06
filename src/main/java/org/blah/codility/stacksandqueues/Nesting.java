package org.blah.codility.stacksandqueues;

public class Nesting {

    public int solution(String S) {

        final char open = '(';

        int openBracketsNr = 0;

        for (int i = 0; i < S.length(); i++) {
             char elem = S.charAt(i);

             if (elem == open) {
                 openBracketsNr += 1;
             } else if (openBracketsNr == 0) {
                 return 0;
             } else {
                 openBracketsNr -= 1;
             }
        }

        if (openBracketsNr == 0) return 1;
        else return 0;
    }

}
