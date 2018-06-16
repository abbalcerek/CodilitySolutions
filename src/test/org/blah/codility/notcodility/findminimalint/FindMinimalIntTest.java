package org.blah.codility.notcodility.findminimalint;

import org.blah.codility.Test;

import java.lang.reflect.InvocationTargetException;

public class FindMinimalIntTest {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Test.testArrayToInt(new int[]{1, 2}, 3, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{1, 3}, 2, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{-11, 2, 4}, 1, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{-1, -2, 0}, 1, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{}, 1, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{1, 2, 3}, 4, FindMinimalInt.class);
        Test.testArrayToInt(new int[]{3, 2, 1}, 4, FindMinimalInt.class);
        Test.testStatus();
    }


}
