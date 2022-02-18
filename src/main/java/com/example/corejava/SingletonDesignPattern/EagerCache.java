package com.example.corejava.SingletonDesignPattern;

import java.util.HashMap;

public class EagerCache implements Cache{

    // Eager initialization
    private static final EagerCache instance = new EagerCache();

    private HashMap<Object,Object> map;

    private EagerCache(){
        map = new HashMap<Object,Object>();
    }

    @Override
    public void put(Object key, Object value) {
        map = new HashMap<Object,Object>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    public static EagerCache getInstance(){
        return instance;
    }
}
