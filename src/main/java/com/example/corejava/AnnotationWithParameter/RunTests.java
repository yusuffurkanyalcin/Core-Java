package com.example.corejava.AnnotationWithParameter;

import com.example.corejava.Annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public static void main(String[] args) throws Exception{
        int tests  = 0;
        int passed = 0;

        Class<?> testClass = Class.forName("com.example.corejava.AnnotationWithParameter.Sample");
        for(Method method : testClass.getDeclaredMethods()){
            if(method.isAnnotationPresent(ExceptionTest.class)){
                tests++;
                try {
                    method.invoke(null);
                    System.out.println("Test " + method + " failed : No exception");
                }catch (InvocationTargetException wrappedExc){
                    Throwable exc = wrappedExc.getCause();
                    Class<? extends Throwable> excType = method.getAnnotation(ExceptionTest.class).value();
                    if(excType.isInstance(exc)){
                        passed++;
                    }else{
                        System.out.println("Test " + method + " failed : excepted " + excType.getName() + " Got : " + exc);
                    }
                }catch (Exception exc){
                    System.out.println("Invalid @ExceptionTest : " + method);
                }
            }
        }
        System.out.println();
        System.out.println("Passed : " + passed);
        System.out.println("Failed : " + (tests - passed));
    }
}
