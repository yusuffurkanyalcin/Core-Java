package com.example.corejava.Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public static void main(String[] args) throws Exception {

        int tests  = 0;
        int passed = 0;

        Class<?> testClass = Class.forName("com.example.corejava.Annotations.Sample");
        for(Method method : testClass.getDeclaredMethods()){
            if(method.isAnnotationPresent(Test.class)){
                tests++;
                try{
                    method.invoke(null);
                    passed++;
                }catch (InvocationTargetException wrappedException){
                    Throwable exc = wrappedException.getCause();
                    System.out.println(method + " failed : " + exc);
                }catch (Exception exc){
                    System.out.println("Invalid @Test : "+ method);
                }
            }
        }
        System.out.println("Passed : " + passed + " Failed : " + (tests-passed));
    }
}
