package com.example.corejava.SingletonDesignPattern;

public class DefineSingleton {

    private static DefineSingleton instance = new DefineSingleton();

    private DefineSingleton(){}

    public static DefineSingleton getInstance(){
        return instance;
    }
}
