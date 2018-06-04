package org.blah.codility.stacksandqueues;

import java.util.Stack;

/**
 * Created by Adam Balcerek on 12/27/16.
 */
public class Brackets {

    static private char pCurly = '}';
    static private char lCurly = '{';

    static private char pSquare = ']';
    static private char lSquare = '[';

    static private char p =')';
    static private char l = '(';


    public int solution(String S) {
        Stack<Character> stack = new Stack<Character>();

        stack.push(S.charAt(0));
        for (int i = 1; i < S.length(); i++){
            char c = S.charAt(i);

            char top = stack.peek();
            if (left(c) == left(top)) stack.push(c);
            else if (type(c) == type(top)) stack.pop();
            else return 0;
        }
        return 1;
    }

    private short type(char c) {
        if (pCurly == c || lCurly == c) return 0;
        if (pSquare == c || lSquare == c) return 1;
        if (p == c || l == c) return 2;
        else throw new IllegalArgumentException();
    }

    private boolean left(char c) {
        if (c == l || c == lCurly || c == lSquare) {
            return true;
        } if (c == p || c == pCurly || c == pSquare) {
            return false;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String... args) {

    }


}
