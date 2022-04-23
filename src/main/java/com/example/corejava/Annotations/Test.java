package com.example.corejava.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // specifies will run in runtime
@Target(ElementType.METHOD) // specifies to use on above of only methods
public @interface Test {

}
