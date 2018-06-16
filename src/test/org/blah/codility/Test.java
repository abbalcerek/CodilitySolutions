package org.blah.codility;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

    private static int successfulTest = 0;
    private static int failedTests = 0;

    public static void initTestSuite() {
        successfulTest = 0;
        failedTests = 0;
    };

    public static void testStatus() {
        System.out.println("================================");
        System.out.println("Successful tests: " + successfulTest);
        System.out.println("Failed tests: " + failedTests);
        initTestSuite();
    }

    public static void testArrayToInt(int[] arr, int expected, Class<?> cls)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        int[] input = Arrays.copyOf(arr, arr.length);
        Object object = cls.getConstructor().newInstance();
        Method method = cls.getMethod("solution", new Class<?>[] {int[].class});
        int actual = (Integer) (method.invoke(object, input));
        System.out.println("============ test ============");
        if (actual != expected) {
            System.out.println("test failed\ninput: " + Arrays.toString(arr) +
                    "\nexpected: " + expected + "\nactual: " + actual);
            failedTests += 1;
        } else {
            System.out.println("test succeeded for imput: " + Arrays.toString(arr) + " result: " + actual);
            successfulTest += 1;
        }
    }

    public static void testIntToInt(int i, int expected, Class<?> cls)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object object = cls.getConstructor().newInstance();
        Method method = cls.getMethod("solution", new Class<?>[] {Integer.class});
        int actual = (Integer) (method.invoke(object, i));
        System.out.println("============ test ============");
        if (actual != expected) {
            System.out.println("test failed\ninput: " + i +
                    "\nexpected: " + expected + "\nactual: " + actual);
        } else {
            System.out.println("test succeeded for imput: " + i + " result: " + actual);
        }
    }

    public static void testStringToInt(String i, int expected, Class<?> cls)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object object = cls.getConstructor().newInstance();
        Method method = cls.getMethod("solution", new Class<?>[] {String.class});
        int actual = (Integer) (method.invoke(object, i));
        System.out.println("============ test ============");
        if (actual != expected) {
            System.out.println("test failed\ninput: " + i +
                    "\nexpected: " + expected + "\nactual: " + actual);
        } else {
            System.out.println("test succeeded for imput: " + i + " result: " + actual);
        }
    }

}
