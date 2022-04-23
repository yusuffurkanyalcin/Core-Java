package com.example.corejava.AnnotationWithParameter;

public class Sample {

    @ExceptionTest(value = ArithmeticException.class)
    public static void method1(){ // Test should pass
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(value = ArithmeticException.class)
    public static void method2(){ // Should fail ( wrong exception type )
        int[] a = new int[0];
        int i = a[1];
    }

    @ExceptionTest(value = Exception.class)
    public static void method3(){
        // Should fail ( no exception )
    }
}
