package com.example.corejava.Annotations;

public class Sample {

    @Test
    public static void method1(){}

    public static void method2(){}

    @Test
    public static void method3(){
        throw new RuntimeException("Boom");
    }

    public static void method4(){}

    @Test
    public void method5(){}

    public static void method6(){}

    @Test
    public static void method7(){
        throw new RuntimeException("Crash");
    }

    public static void method8(){}
}
