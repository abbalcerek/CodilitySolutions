package org.blah.codility.leader;

import org.blah.codility.Test;

import java.lang.reflect.InvocationTargetException;



public class DominatorTest {


    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {
        Test.testArrayToInt(new int[]{1, 1, 1}, 2, Dominator.class);
        Test.testArrayToInt(new int[]{0, 1, 2}, -1, Dominator.class);
        Test.testArrayToInt(new int[]{0, 1, 1}, 2, Dominator.class);
    }

}
