package com.example.corejava.EqualsAndHashcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        DemoClass instance1 = new DemoClass(10 , 11 );
        DemoClass instance2 = new DemoClass(10 , 11 );

//        if(instance1.equals(instance2))
//            System.out.println("Equals");
//        else
//            System.out.println("Not equals");

        Map<DemoClassOvrd,String> map = new HashMap<>();
        map.put(new DemoClassOvrd(1,2),"First Item");

        System.out.println(map.get(new DemoClassOvrd(1,2)));

    }
}