package com.example.corejava.GenericWildcards;

import java.util.HashSet;
import java.util.Set;

public class Union {

    public static <E> Set<E> union(Set<E> s1, Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static <T extends Number> int sum(T v1, T v2){
        return v1.intValue()+v2.intValue();
    }
}
