package org.blah.codility.stacksandqueues;

import org.blah.codility.Test;

import java.lang.reflect.InvocationTargetException;

public class BracketsTest {

    public static void main(String[] args) throws InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        Test.testStringToInt("({[]})", 1, Brackets.class);
        Test.testStringToInt("{[()()]}", 1, Brackets.class);

        Test.testStringToInt("([)()]", 0, Brackets.class);

        Test.testStringToInt("{[()()]}}", 0, Brackets.class);

        Test.testStringToInt(")(", 0, Brackets.class);
    }

}
