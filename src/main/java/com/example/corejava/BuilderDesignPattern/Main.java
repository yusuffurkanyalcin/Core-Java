package com.example.corejava.BuilderDesignPattern;

public class Main {

    public static void main(String[] args) {

        CoffeeBuilder cb = new CoffeeBuilder.Builder("Middle")
                                            .blackCoffe(true)
                                            .coffeWithMilk(true)
                                            .build();


    }
}
