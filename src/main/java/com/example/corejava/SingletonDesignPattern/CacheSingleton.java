package com.example.corejava.SingletonDesignPattern;

import java.util.HashMap;

public enum CacheSingleton implements Cache{
    INSTANCE;

    private HashMap<Object,Object> map = new HashMap<Object,Object>();

    @Override
    public void put(Object key, Object value) {
        map = new HashMap<Object,Object>();
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }
}
