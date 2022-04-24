package com.example.corejava.AnnotationWithArrayParameter;

import java.util.ArrayList;
import java.util.List;

public class Sample {
  
    @ExceptionTest(ArithmeticException.class)
    public static void method1() { // Test should pass
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void method2() { // Should fail (wrong exception)
        int[] a = new int[0];
        int i = a[1];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void method3() {
    } // Should fail (no exception)

    @ExceptionTest({ IndexOutOfBoundsException.class, NullPointerException.class })
    public static void doublyBad() { // Should pass
        List<String> list = new ArrayList<>();

        // The spec permits this method to throw either
        // IndexOutOfBoundsException or NullPointerException
        list.addAll(5, null);
    }
}
